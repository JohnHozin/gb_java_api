package other.alter_hw.hw_1;

import java.util.Scanner;

public class Task_alter_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        String move = "";
        int secondNumber = 0;
        while (true) {
            System.out.print("Введите первое число: ");
            try {
                firstNumber = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.print("Ошибка! ");
            }
        }
        while (true) {
            System.out.print("Введите действие: ");
            try {
                move = scanner.next();
                if (move.equals("+") || move.equals("-") || move.equals("*") || move.equals("/")){
                    break;
                } else {
                    System.out.println("Ошибка! Можно только: + - * / ");
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.print("Ошибка! ");
            }
        }
        while (true) {
            System.out.print("Введите второе число: ");
            try {
                secondNumber = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.print("Ошибка! ");
            }
        }

        switch (move){
            case "+":
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                break;
        }
    }
}
