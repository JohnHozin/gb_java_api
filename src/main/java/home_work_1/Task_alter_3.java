package home_work_1;

import java.util.Scanner;

public class Task_alter_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_number = scanner.nextInt();
        System.out.print("Введите действие: ");
        String move = scanner.next();
        System.out.print("Введите второе число: ");
        int second_number = scanner.nextInt();

        switch (move){
            case "+":
                System.out.println(first_number + " + " + second_number + " = " + (first_number + second_number));
                break;
            case "-":
                System.out.println(first_number + " - " + second_number + " = " + (first_number - second_number));
                break;
            case "*":
                System.out.println(first_number + " * " + second_number + " = " + (first_number * second_number));
                break;
            case "/":
                System.out.println(first_number + " / " + second_number + " = " + (first_number / second_number));
                break;
            default:
                System.out.println("Введена неправильная операция!");
                break;
        }
    }
}
