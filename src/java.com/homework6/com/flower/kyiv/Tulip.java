package homework6.com.flower.kyiv;

public class Tulip extends Flower {
    public static final int PRICE = 45;

    public Tulip() {
        super(PRICE);
    }

    @Override
    public String name() {
        return "tulip";
    }
}
