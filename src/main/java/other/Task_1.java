package other;

import java.util.*;

/**
 * // +На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
 * // - команда 1 (к1): увеличить а в с раз, а умножается на c
 * // - команда 2 (к2): увеличить на d, к a прибавляется d
 * // написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
 * // Пример 1: а = 1, b = 7, c = 2, d = 1
 * // ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2
 * // Можно начать с более простого – просто подсчёта общего количества вариантов
 * // Пример 2: а = 11, b = 7, c = 2, d = 1
 * // ответ: нет решения.
 * // *Подумать над тем, как сделать минимальное количество команд
 **/
public class Task_1 {
    public static void main(String[] args) {
//        int a = textInputScanner("a");
//        int b = textInputScanner("b");
//        int c = textInputScanner("c");
//        int d = textInputScanner("d");
//        int a = 1;
//        int b = 7;
//        int c = 2;
//        int d = 1;

        int a = 21;
        int b = 75;
        int c = 2;
        int d = 11;
        int temp = a;
        ArrayList<String> arr = new ArrayList<>();
        TreeSet<String> finish_set = new TreeSet<>();
        Random rnd = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            while (temp != b) {
                int choose = rnd.nextInt(0, 1000);
                if (choose > 500) {
                    if (b / temp >= c) {
                        temp *= c;
                        arr.add("k1");
                    }
                } else {
                    if (b - temp >= d) {
                        temp += d;
                        arr.add("k2");
                    }
                }
                if (b - temp < d && temp != b) {
//                    System.out.println("Error " + i);
                    break;
                }
            }
//            System.out.print(i + ") " + temp + "   ");
//            System.out.println(arr);
            if (b==temp) {
                String index = "";
                if (arr.size()<10){
                    index = "0";
                }
                arr.add(0, index + String.valueOf(arr.size()) + ")");
                finish_set.add(String.join(", ", arr));
                arr.clear();
            }
            temp = a;
        }
        if (finish_set.isEmpty()){
            System.out.println("Решений нет!");
        } else{
            for (String set:finish_set) {
                System.out.println(set);
            }
        }
    }

    static int textInputScanner(String number) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Введите число " + number + ": ");
            try {
                n = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.print("Ошибка! ");
            }
        }
        return n;
    }
}
