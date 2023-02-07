package seminar.seminar_6;

import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = createArr();
        System.out.println(qwe(arr));
    }

    private static Double qwe(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
//        return (((double) set.size()) * 100) / arr.length;
        return ( set.size() * 100.0) / arr.length;
    }

    private static int[] createArr() {
        int[] arr = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 1000);
        }
        return arr;
    }
}
