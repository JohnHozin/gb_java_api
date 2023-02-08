package home_work.home_work_5;

import java.util.*;

/**
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */

public class Task_2 {
    public static void main(String[] args) {
        List<String> list = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
//        System.out.println(list);
        findAndSort(list);
    }

    private static void findAndSort(List<String> list) {
        List<String> names = new ArrayList<>();
        for (String l : list) {
            names.add(l.split(" ")[0]);
        }
        Set<String> namesOfSet = new HashSet<>(names);

//        System.out.println(namesOfSet);
//        for (String s : namesOfSet) {
//            System.out.printf("%9s\t%d%n", s, Collections.frequency(names, s));
//        }

        Map<Integer, List<String>> map = new TreeMap<>(Collections.reverseOrder());
        for (String s : namesOfSet) {
            int temp = Collections.frequency(names, s);
            List<String> list1;
            if (map.containsKey(temp)){
                list1 = map.get(temp);
            } else {
                list1 = new ArrayList<>();
            }
            list1.add(s);
            map.put(temp, list1);
        }
        System.out.println(map);
    }
}
