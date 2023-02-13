package seminar.seminar_oop_2;

public class Crocodile extends Predator implements Runnable,Swimable{

    public Crocodile(String nickname) {
        super(nickname);
    }

    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public String say() {
        return "am-am";
    }

    @Override
    public int speedOfSwim() {
        return 20;
    }

    @Override
    public String toString() {
        return "I am Crocodile" + super.toString() + " and my speed is " + speedOfRun() + " and my speed of swim is " + speedOfSwim();
    }
}
