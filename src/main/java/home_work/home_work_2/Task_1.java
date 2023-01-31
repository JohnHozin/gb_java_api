package home_work.home_work_2;

import java.util.Scanner;

public class Task_1 {
    /**
     * Напишите метод, который принимает на вход строку (String) и определяет, является ли строка палиндромом (возвращает boolean значение).
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome(inputText()));
    }

    private static boolean isPalindrome(String text) {
        if (text.isBlank()) {
            return false;
        }
        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    private static String inputText() {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, для проверки её на палиндром: ");
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}
