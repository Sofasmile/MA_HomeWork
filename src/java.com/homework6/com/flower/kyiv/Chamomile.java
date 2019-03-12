package homework6.com.flower.kyiv;

public class Chamomile extends Flower {
    public static final int PRICE = 70;

    public Chamomile() {
        super(PRICE);
    }

    @Override
    public String name() {
        return "chamomile";
    }
}
