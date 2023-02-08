package home_work.home_work_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

public class Task_1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        addNewNote(phoneBook, "Светлана Петрова", "8-917-555-66-66");
        addNewNote(phoneBook, "Светлана Петрова", "8-917-555-66-77");
        addNewNote(phoneBook, "Кристина Белова", "8-917-555-66-88");
        addNewNote(phoneBook, "Анна Мусина", "8-917-555-66-99");
        addNewNote(phoneBook, "Анна Мусина", "8-917-555-66-00");

        System.out.println(phoneBook);
    }

    private static void addNewNote(HashMap<String, List<String>> phoneBook, String name, String phone){
        List<String> list;
        if (phoneBook.containsKey(name)){
            list = phoneBook.get(name);
        } else {
            list = new ArrayList<>();
        }
        list.add(phone);
        phoneBook.put(name, list);
    }
}
