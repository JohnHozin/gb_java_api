package seminar.seminar_oop_4;

public class Archer extends BaseHero<Ranged,NoneShield>{
    public Archer(int health, String name, Ranged ranged) {
        super(health, name, ranged);
    }

    public int range(){
        return weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer "  + super.toString();
    }
}
