package homework6.com.flower.kyiv;

public abstract class Flower {
    private int price;
    public Flower(int price) {
        this.price = price;
    }

    public String name() {
        return "flower";
    }
}
