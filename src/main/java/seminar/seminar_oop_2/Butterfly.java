package seminar.seminar_oop_2;

public class Butterfly extends Herbivores implements Flyable{

    public Butterfly(String nickname) {
        super(nickname);
    }

    @Override
    public int speedOfFly() {
        return 5;
    }

    @Override
    public String say() {
        return "fla-fla";
    }

    @Override
    public String toString() {
        return "I am Butterfly" + super.toString() + " and my speed of fly is " + speedOfFly();
    }
}
