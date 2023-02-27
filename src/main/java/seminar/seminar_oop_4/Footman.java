package seminar.seminar_oop_4;

public class Footman extends BaseHero<Melee>{

    public Footman(int health, String name, Melee melee) {
        super(health, name, melee);
    }

    @Override
    public String toString() {
        return "Footman " + super.toString();
    }
}
