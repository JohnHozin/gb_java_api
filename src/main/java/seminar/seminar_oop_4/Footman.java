package seminar.seminar_oop_4;

public class Footman extends BaseHero<Melee,Shield>{

    public Footman(int health, String name, Melee melee) {
        super(health, name, melee);
    }

    public Footman(int health, String name, Melee melee, Shield shield) {
        super(health, name, melee,shield);
    }

    @Override
    public String toString() {
        return "Footman " + super.toString();
    }
}
