package seminar.seminar_oop_2;

public class Cow extends Herbivores implements Runnable {
    public Cow(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "my-my";
    }

    @Override
    public String toString() {
        return "I am Cow" + super.toString() + " and my speed is " + speedOfRun();
    }

    @Override
    public int speedOfRun() {
        return 5;
    }
}
