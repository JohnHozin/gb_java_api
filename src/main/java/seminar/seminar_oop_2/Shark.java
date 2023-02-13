package seminar.seminar_oop_2;

public class Shark extends Predator implements Swimable{

    public Shark(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "bull-bull";
    }

    @Override
    public int speedOfSwim() {
        return 25;
    }

    @Override
    public String toString() {
        return "I am Shark" + super.toString() + " and my speed of swim is " + speedOfSwim();
    }
}
