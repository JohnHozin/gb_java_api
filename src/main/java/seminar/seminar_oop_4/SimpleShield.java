package seminar.seminar_oop_4;

public class SimpleShield implements Shield {

    private String name;

    public SimpleShield(String name) {
        this.name = name;
    }

    public SimpleShield() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double defence() {
        return 0.9;
    }

    @Override
    public String toString() {
        return "SimpleShield{" +
                "name='" + name + '\'' +
                '}';
    }
}
