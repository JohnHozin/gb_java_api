package home_work_1;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-999, 1000);
        }

        int min_value = 0;
        int max_value = 0;
        for (int i = 0; i < arr.length; i++) {
            min_value = Math.min(min_value, arr[i]);
            max_value = Math.max(max_value, arr[i]);
        }

        System.out.println("Максимальный элемент: " + min_value);
        System.out.println("Минимальный элемент: " + max_value);
    }
}
