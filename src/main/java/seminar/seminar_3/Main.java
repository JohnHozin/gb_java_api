package seminar.seminar_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(rnd.nextInt(3,10));
        }
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>(list);
        Collections.sort(list1);
        System.out.println(list1);

        list.sort(Comparator.reverseOrder());
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
