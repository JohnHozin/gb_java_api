package home_work.home_work_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_alter_2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        int n = 2;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (arr[j] % n == 0 && arr[j] != n) {
                    arr[j] = 0;
                }
            }
            n++;
        }
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> simpleNumbers = new ArrayList<>();
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 1000; i++) {
            if (arr[i] !=0){
                simpleNumbers.add(arr[i]);
            }
        }
        System.out.println(simpleNumbers);
    }
}
