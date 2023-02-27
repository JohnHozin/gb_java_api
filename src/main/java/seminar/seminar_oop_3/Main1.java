package seminar.seminar_oop_3;

import java.util.LinkedList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.contains(7));

    }
}
