package seminar.seminar_oop_2;

public abstract class Predator extends Animal{

    public Predator(String nickname) {
        super(nickname);
    }

    @Override
    public String feed() {
        return "meat";
    }
}
