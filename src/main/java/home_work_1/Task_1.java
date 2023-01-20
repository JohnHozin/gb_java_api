package home_work_1;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-999, 1000);
        }

        int minValue = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            minValue = Math.min(minValue, arr[i]);
            maxValue = Math.max(maxValue, arr[i]);
        }

        System.out.println("Максимальный элемент: " + minValue);
        System.out.println("Минимальный элемент: " + maxValue);
    }
}
