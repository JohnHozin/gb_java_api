package seminar.seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    /**
     * Принимает от пользователя строку вида
     * text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
     * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
     */
    public static void main(String[] args) {
        String text = inputText();
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        parseText(list, text);
        System.out.println(list);
        startEndlessСycle(list);
    }

    private static void startEndlessСycle(LinkedList<String> list1) {
        String text = "";
        while (true) {
            text = inputText();
            if (text.equals("exit") || !text.contains("~")) {
                return;
            }
            parseText(list1, text);
            System.out.println(list1);
        }
    }

    private static String inputText() {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запрос: ");
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }

    private static LinkedList parseText(LinkedList<String> list1, String text) {
        String action = "";
        String index = "";
        if (!text.contains("~")) {
            return list1;
        } else {
            action = text.split("~")[0];
            index = text.split("~")[1];
            int ind = 0;
            try {
                ind = Integer.parseInt(index);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (ind >= list1.size() && ind < 0) {
                throw new RuntimeException("Выход за пределы Листа");
            }
            if (action.equals("print")) {
                System.out.println(list1.get(ind));
                list1.remove(ind);
            } else {
                list1.set(ind, action);
            }
        }
        return list1;
    }
}
