package homework6.com.flower.kyiv;

public class Rose extends Flower {
    public static final int PRICE = 100;

    public Rose() {
        super(PRICE);
    }

    @Override
    public String name() {
        return "rose";
    }
}
