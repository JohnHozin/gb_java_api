package seminar.seminar_oop_4;

public class Shield implements Armor{

    private String name;
    private int defencePoint;

    public Shield(String name, int defencePoint) {
        this.name = name;
        this.defencePoint = defencePoint;
    }

    public Shield() {
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
    public int defence() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "name='" + name + '\'' +
                ", defencePoint=" + defencePoint +
                '}';
    }
}
