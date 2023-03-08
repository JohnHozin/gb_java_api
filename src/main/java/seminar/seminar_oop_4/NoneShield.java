package seminar.seminar_oop_4;

public class NoneShield implements Shield{

    @Override
    public double defence() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "Shield{none}";
    }
}
