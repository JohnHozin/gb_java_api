package seminar.seminar_oop_2;

public class Duck extends Herbivores implements Runnable, Flyable{

    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfFly() {
        return 50;
    }

    @Override
    public String say() {
        return "kra-kra";
    }

    @Override
    public String toString() {
        return "I am Duck" + super.toString() + " and my speed is " + speedOfRun()+ " and my speed of fly is " + speedOfFly();
    }
}
