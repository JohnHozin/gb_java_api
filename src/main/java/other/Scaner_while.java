package other;

import java.util.Scanner;

public class Scaner_while {
    public static void main(String[] args) {
        int n=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите первое число: ");
            try {
                n = scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                scanner.nextLine();
//                System.out.print("Ошибка! ");

            }
        } while (n<=0);
        System.out.println(n);
    }
}
