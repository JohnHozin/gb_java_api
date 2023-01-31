package home_work.home_work_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            if (year >= 0) {
                System.out.println(isBissextile(year));
            } else {
                System.out.println("Ошибка! Отрицательное число!");
            }
        } else {
            System.out.println("Ошибка ввода!");
        }
    }

    static boolean isBissextile(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

}
