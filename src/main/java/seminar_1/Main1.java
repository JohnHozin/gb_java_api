package seminar_1;

import java.util.Arrays;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 2);
        }

        int chet = 0;
        int max = 0;
        for (int j : arr) {
            if (j == 1) {
                chet++;
            } else {
                if (chet > max) {
                    max = chet;
                }
                chet = 0;
            }
        }
        if (chet > max) {
            max = chet;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(max);

        for (int i = 0; i < max; i++) {
            System.out.print(1);
        }
    }
}
