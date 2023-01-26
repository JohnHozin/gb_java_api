package home_work_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task_2 {
    /**
     * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
     * который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
    public static void main(String[] args) {
        writeInFail(writeTest100Times());
    }

    private static void writeInFail(StringBuilder sb) {
        if (sb.isEmpty()) {
            System.out.println("Нет данных для записи!");
            return;
        }

        try (PrintWriter pw = new PrintWriter("src/main/resources/lib/test.txt")) {
            pw.print(sb);
            System.out.println("Данные успешно записаны!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder writeTest100Times() {
        StringBuilder sb = new StringBuilder();
        sb.append("TEST ".repeat(100));    // "TEST"   или  "TEST, "
        return sb;
    }
}
