package homework6;

import homework6.com.flower.kyiv.Flower;
import homework6.service.FlowerStore;

public class Program {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        Flower[] f1 = flowerStore.sellSequence(2, 4, 5);
        Flower[] f2 = flowerStore.sell(2, 3, 4);
        flowerStore.showBouquet(f1);
        System.out.println();
        flowerStore.showBouquet(f2);
        System.out.println();
        System.out.println(flowerStore.getPurse());
    }
}
