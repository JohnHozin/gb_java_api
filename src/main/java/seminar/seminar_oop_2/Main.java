package seminar.seminar_oop_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(List.of(new Cat("Barsik"),new Dog("Sharik"), new Rabbit("Whik"),
                new Cow("Murka"), new Duck("Krya"), new Butterfly("Flay"),
                new Shark("BigWhite"), new Crocodile("Gandy")));

        for (Sayable animal: zoo.getSayable()){
            System.out.println(animal.say());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        for (Runnable runable: zoo.getRunable()){
            System.out.println(runable);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        for (Flyable flyable: zoo.getFlyable()){
            System.out.println(flyable);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(zoo.getWinner());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(zoo.getWinnerFly());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(zoo.getWinnerSwim());

    }
}
