package homework6;

public class Rose extends Flower {
    private final int price = 100;

    public Rose() {
        super.price = this.price;
    }

    public void name() {
        System.out.println("rose");
    }
}
