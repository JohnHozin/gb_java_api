package seminar.seminar_5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(123456, "Иванов");
        people.put(321456, "Васильев");
        people.put(234561, "Петрова");
        people.put(234432, "Иванов");
        people.put(654321, "Петрова");
        people.put(345678, "Иванов");


        for (var item : people.entrySet()) {
            if (item.getValue().equals("Иванов")){
                System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
            }
        }

//        for (Integer key : people.keySet()) {
//            if ("Иванов".equals()){
//                System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
//            }
//        }



    }
}
