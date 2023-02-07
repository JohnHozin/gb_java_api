package seminar.seminar_6;

import java.sql.Time;
import java.util.ArrayList;
import java.util.TreeMap;

public class Cat {
    String name;
    String color;
    Double age;
    boolean male;
    double weight;
    double height;
    ArrayList<String> history;
    String breed;
    ArrayList<String> vac;
    String owner;
    int id;
    TreeMap<Time,Double> temperature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name, String color, Double age, boolean male) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.male = male;
    }

    public Cat() {
    }
}
