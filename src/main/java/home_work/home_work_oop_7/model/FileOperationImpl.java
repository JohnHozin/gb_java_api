package home_work.home_work_oop_7.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationImpl implements FileOperation {

    private String fileName;
    private Logger logger;

    public FileOperationImpl(String fileName, Logger logger) {
        this.fileName = fileName;
        this.logger = logger;
        logger.writeLogToFile("start constructor in FileOperationImpl");
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        logger.writeLogToFile("end constructor in FileOperationImpl");
    }

    public List<String> readAllLines() {
        logger.writeLogToFile("start method readAllLines in FileOperationImpl");
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // считываем остальные строки в цикле
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.writeLogToFile("end method readAllLines in FileOperationImpl");
        return lines;
    }

    public void saveAllLines(List<String> lines) {
        logger.writeLogToFile("start method saveAllLines in FileOperationImpl");
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : lines) {
                // запись всей строки
                writer.write(line);
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        logger.writeLogToFile("end method saveAllLines in FileOperationImpl");
    }
}
