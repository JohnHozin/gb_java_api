package seminar.seminar_oop_4;

public class HardShield implements Shield {

    private String name;
    private int defencePoint;

    public HardShield(String name, int defencePoint) {
        this.name = name;
        this.defencePoint = defencePoint;
    }

    public HardShield() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefencePoint() {
        return defencePoint;
    }

    public void setDefencePoint(int defencePoint) {
        this.defencePoint = defencePoint;
    }

    @Override
    public double defence() {
        return 0.8;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "name='" + name + '\'' +
                ", defencePoint=" + defencePoint +
                '}';
    }
}
