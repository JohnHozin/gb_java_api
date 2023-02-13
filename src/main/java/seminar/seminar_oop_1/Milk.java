package seminar.seminar_oop_1;

public class Milk extends Product{

    private Double fatContent;

    public Milk(String name, Double price) {
        super(name, price);
    }

    public Milk(String name, Double price, double fatContent) {
        super(name, price);
        this.fatContent = fatContent;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return String.format("%s fatContent = %.2f;", super.toString(), fatContent);
    }
}
