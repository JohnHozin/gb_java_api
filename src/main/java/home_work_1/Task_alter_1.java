package home_work_1;

import java.util.Scanner;

public class Task_alter_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Введите число n: ");
            try {
                n = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.print("Ошибка! ");
            }
        }

        if (n > 0) {
            System.out.println(triangleNumber(n));
            if (n < 45) {
                System.out.println(factorial(n));
            } else {
                System.out.println("Ошибка! Слишком большое число!");
            }
        } else {
            System.out.println("Ошибка! n <= 0!");
        }
    }

    static int triangleNumber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + triangleNumber(n - 1));
        }
    }

    static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
