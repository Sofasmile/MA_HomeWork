package homework6;

public class Tulip extends Flower {
    private final int price = 45;

    public Tulip() {
        super.price = this.price;
    }

    public void name() {
        System.out.println("tulip");
    }
}
