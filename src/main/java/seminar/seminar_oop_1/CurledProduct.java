package seminar.seminar_oop_1;

public class CurledProduct extends Product{

    private int longevity;

    public CurledProduct(String name, Double price, int longevity) {
        super(name, price);
        this.longevity = longevity;
    }

    public int getLongevity() {
        return longevity;
    }

    public void setLongevity(int longevity) {
        this.longevity = longevity;
    }

    @Override
    public String toString() {
        return String.format("%s longevity = %d;", super.toString(), longevity);
    }
}
