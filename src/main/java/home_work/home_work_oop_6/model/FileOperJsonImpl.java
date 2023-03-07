package home_work.home_work_oop_6.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperJsonImpl implements FileOperation{

    private String fileName;

    public FileOperJsonImpl(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<String> readAllLines() {
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

//    public void saveAllLines(List<String> lines) {
//        try (FileWriter writer = new FileWriter(fileName, false)) {
//            for (String line : lines) {
//                // запись всей строки
//                writer.write(line);
//                // запись по символам
//                writer.append('\n');
//            }
//            writer.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

    public void saveAllLines(List<String> lines) {
//        try (FileWriter writer = new FileWriter(fileName, false)) {
//            writer.write("{\n");
//            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
//            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
//            writer.write("\"qnt\":" + order.getQnt() + ",\n");
//            writer.write("\"price\":" + order.getPrice() + "\n");
//            writer.write("}\n");
//            writer.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}
