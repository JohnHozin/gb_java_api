package seminar.seminar_oop_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan", "Petrov", 34);
        User user2 = new User("Vasa", "Petrov", 45);
        User user3 = new User("John", "Petrov", 26);
        User user4 = new User("Sasha", "Petrov", 27);
        User user5 = new User("Vova", "Petrov", 28);
        User user6 = new User("Petr", "Petrov", 23);

        Personal personal = new Personal(List.of(user6, user1, user2, user3, user4, user5));
//        for (var i:personal){
//            System.out.println(i);
//        }

        List<User> users = personal.toList();
//        for (User user : users) {
//            System.out.println(user);
//        }

//        Collections.sort(List.of(user,user1,user2,user3,user4,user5));
        Collections.sort(users);
//        System.out.println(list);
//        for (User user : users) {
//            System.out.println(user);
//        }

        User boss = new User("Will", "Smith", 50);
        User smallBoss = new User("Bill", "White", 36);
        User ceo = new User("Joe", "Black", 39);
        User manager1 = new User("Jane", "Air", 28);
        User manager2 = new User("Bella", "Green", 30);
        User manager3 = new User("Alex", "Bright", 20);
        Personal managers1 = new Personal(List.of(manager1, manager2));
        Personal managers2 = new Personal(List.of(manager3));
        Personal chief = new Personal(List.of(smallBoss, ceo));
        boss.setPersonal(chief);
        smallBoss.setPersonal(managers1);
        ceo.setPersonal(managers2);

        Company company = new Company(boss);
        for (User user: company){
            System.out.println(user);
        }
    }
}
