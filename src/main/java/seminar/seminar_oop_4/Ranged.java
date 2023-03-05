package seminar.seminar_oop_4;

public class Ranged implements Weapon{

    private String name;
    private int damagePoint;
    private int range;

    public Ranged(String name, int damagePoint, int range) {
        this.name = name;
        this.damagePoint = damagePoint;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Ranged{" +
                "name='" + name + '\'' +
                ", damagePoint=" + damagePoint +
                ", range=" + range +
                '}';
    }

    @Override
    public int damage() {
        return damagePoint;
    }
}
