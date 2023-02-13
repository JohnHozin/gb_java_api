package seminar.seminar_oop_2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();


    public List<Animal> addAnimals(List<Animal> animals){
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayable(){
        List<Sayable> result = new ArrayList<>();
        for (Animal animal: animals) {
            result.add(animal);
        }
        result.add(radio);
        return result;
    }

    public List<Runnable> getRunable(){
        List<Runnable> result = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public Runnable getWinner(){
        List<Runnable> list = getRunable();
        Runnable winner = list.get(0);
        for (Runnable runable: list){
            if (runable.speedOfRun() > winner.speedOfRun()){
                winner = runable;
            }
        }
        return winner;
    }

    public Flyable getWinnerFly(){
        List<Flyable> list = getFlyable();
        Flyable winner = list.get(0);
        for (Flyable flyable: list){
            if (flyable.speedOfFly() > winner.speedOfFly()){
                winner = flyable;
            }
        }
        return winner;
    }
}
