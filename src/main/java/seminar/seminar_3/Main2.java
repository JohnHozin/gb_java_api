package seminar.seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        String[] planets = new String[]{
                "Меркурий", "Венера", "Земля",
                "Марс", "Юпитер", "Сатурн",
                "Уран", "Нептун"
        };

        Random rnd = new Random();
        ArrayList<String> list = new ArrayList<>();
        int listSize = rnd.nextInt(100,126);
        for (int i = 0; i < listSize; i++) {
            list.add(planets[rnd.nextInt(planets.length)]);
        }

        System.out.println(list);
        TreeSet<String> set = new TreeSet<>(list);
        System.out.println(set);

        for (String s : set) {
//            System.out.print(s + " ");
//            System.out.println(Collections.frequency(list, s));
            System.out.printf("%8s\t%d%n", s, Collections.frequency(list, s));
//            System.out.println(String.format());
        }


//        int temp = 0;
//        for (String s : set) {
//            for (String l : list) {
//                if (s.equals(l)) {
//                    temp++;
//                }
//            }
//            System.out.println(s + " " + temp);
//            temp = 0;
//        }
    }
}
