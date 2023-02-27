package seminar.seminar_oop_4;

public class Melee implements Weapon{

    private String name;
    private int damagePoint;

    public Melee(String name,int damagePoint) {
        this.name = name;
        this.damagePoint = damagePoint;
    }

    public Melee() {
    }

    @Override
    public int damage() {
        return damagePoint;
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

    @Override
    public String toString() {
        return "Melee{" +
                "name='" + name + '\'' +
                ", damagePoint= " + damagePoint +
                '}';
    }
}
