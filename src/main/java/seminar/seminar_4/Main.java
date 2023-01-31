package seminar.seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        someMethod();
    }

    private static void someMethod() {
        final int LIST_SIZE = 10000000;


        List<Random> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(0,new Random());
        }

        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Random> arrayList = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(0,new Random());
        }

        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));


    }


}
