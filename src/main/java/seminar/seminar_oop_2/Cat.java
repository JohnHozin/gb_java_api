package seminar.seminar_oop_2;

public class Cat extends Predator implements Runnable {

    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "meow-meow";
    }

    @Override
    public String toString() {
        return "I am Cat" + super.toString() + " and my speed is " + speedOfRun();
    }

    @Override
    public int speedOfRun() {
        return 15;
    }
}
