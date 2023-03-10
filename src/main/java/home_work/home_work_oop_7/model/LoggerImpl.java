package home_work.home_work_oop_7.model;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger {
    private String fileName;

    public LoggerImpl(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(getTime());
            writer.write("start program");
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void writeLogToFile(String log) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(getTime());
            writer.write(log);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String getTime() {
//        return LocalDateTime.now().toString();   // такой вариант тоже подходит, если убрать Т и округлить секунды
        return LocalDateTime.now().getDayOfMonth() + "-" + (LocalDateTime.now().getMonthValue() > 9 ? LocalDateTime.now().getMonthValue() : "0" + LocalDateTime.now().getMonthValue()) +
                "-" + LocalDateTime.now().getYear() + " " + LocalDateTime.now().getHour() +
                ":" + LocalDateTime.now().getMinute() + ":" + (LocalDateTime.now().getSecond() > 9 ? LocalDateTime.now().getSecond() : "0" + LocalDateTime.now().getSecond()) + " : ";
    }


}
