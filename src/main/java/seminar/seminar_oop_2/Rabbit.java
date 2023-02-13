package seminar.seminar_oop_2;

public class Rabbit extends Herbivores implements Runnable {

    public Rabbit(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "qwe";
    }

    @Override
    public String toString() {
        return "I am Rabbit" + super.toString() + " and my speed is " + speedOfRun();
    }

    @Override
    public int speedOfRun() {
        return 10;
    }
}
