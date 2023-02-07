package home_work.home_work_4;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Принимает от пользователя и “запоминает” строки.
 * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 * Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

public class Task_1 {
    public static void main(String[] args) {
        firstVariant();
//        secondVariant();
    }

    private static void firstVariant() {
        Deque<String> arrayDeque = new ArrayDeque<>();
        while (true) {
            String text = inputText();
            if (text.equalsIgnoreCase("print")) {
                for (String s : arrayDeque) {
                    System.out.println(s);
                }
            } else if (text.equalsIgnoreCase("revert")) {
                arrayDeque.removeFirst();
            } else if (text.equalsIgnoreCase("exit")) {
                break;
            } else {
                arrayDeque.addFirst(text);
            }
        }
    }

    private static void secondVariant() {
        List<String> list = new ArrayList<>();
        while (true) {
            String text = inputText();
            if (text.equalsIgnoreCase("print")) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.println(list.get(i));
                }
            } else if (text.equalsIgnoreCase("revert")) {
                list.remove(list.size() - 1);
            } else if (text.equalsIgnoreCase("exit")) {
                break;
            } else {
                list.add(text);
            }
        }
    }

    private static String inputText() {
        final String location = "src/main/resources/lib/log.txt";
        DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запрос: ");
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(location, true))) {
                String time = dateF.format(Calendar.getInstance().getTime());
                pw.print(time + "   ");
                e.printStackTrace(pw);
                pw.print("\n");
            } catch (IOException er) {
                er.printStackTrace();
            }
            e.printStackTrace();
        }
        return text;
    }
}
