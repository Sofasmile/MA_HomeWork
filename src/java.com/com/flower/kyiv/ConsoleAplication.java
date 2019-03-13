package com.flower.kyiv;

import com.flower.kyiv.entity.Flower;
import com.flower.kyiv.service.FlowerStore;

public class ConsoleAplication {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        Flower[] f1 = flowerStore.sellSequence(4, 3, 2);
        Flower[] f2 = flowerStore.sell(2, 3, 4);
        flowerStore.showBouquet(f1);
        System.out.println();
        flowerStore.showBouquet(f2);
        System.out.println();
        System.out.println(flowerStore.getPurse());
    }
}
