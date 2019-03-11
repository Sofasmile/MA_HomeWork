package homework6;

public class Chamomile extends Flower {
    private final int price = 70;

    public Chamomile() {
        super.price = this.price;
    }

    public void name() {
        System.out.println("chamomile");
    }
}
