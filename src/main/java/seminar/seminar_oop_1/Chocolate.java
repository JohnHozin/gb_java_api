package seminar.seminar_oop_1;

public class Chocolate extends Product {

    private String color;
    private String taste;

    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, Double price, String color) {
        super(name, price);
        this.color = color;
    }

    public Chocolate(String name, Double price, String color, String taste) {
        super(name, price);
        this.color = color;
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("%s color = %s, taste = %s;", super.toString(), color, taste);
    }
}
