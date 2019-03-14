package com.flower.kyiv.service;

import com.flower.kyiv.entity.Chamomile;
import com.flower.kyiv.entity.Tulip;
import com.flower.kyiv.entity.Flower;
import com.flower.kyiv.entity.Rose;

import java.util.Arrays;

public class FlowerStore {
    private int purse;
    private Flower[] flowers;

    public int getPurse() {
        return purse;
    }

    private void addMoney(Flower[] flowers) {
        for (Flower f : flowers) {
            purse += f.getPrice();
        }
    }

    public Flower[] sell(int countRose, int countTulip, int countChamomile) {
        int count = countRose + countTulip + countChamomile;
        flowers = new Flower[count];
        for (int i = 0; i < count; i++) {
            flowers[i] = addFlower(i, countRose, countTulip);
        }
        addMoney(flowers);
        return flowers;
    }

    private Flower addFlower(int i, int countRose, int countTulip) {
        return (i < countRose) ? new Rose()
                : (i < (countTulip + countRose)) ? new Tulip()
                : new Chamomile();
    }

    public Flower[] sellSequence(int countRose, int countTulip, int countChamomile) {
        int count = countRose + countTulip + countChamomile;
        flowers = new Flower[count];
        for (int i = 0; i < count; ) {
            if (countRose > 0) {
                flowers[i++] = new Rose();
                countRose--;
            }
            if (countTulip > 0) {
                flowers[i++] = new Tulip();
                countTulip--;
            }
            if (countChamomile > 0) {
                flowers[i++] = new Chamomile();
                countChamomile--;
            }
        }
        addMoney(flowers);
        return flowers;
    }

    public void showBouquet(Flower[] flowers) {
        String[] names = new String[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            names[i] = flowers[i].toString();
        }
        System.out.println(Arrays.toString(names));
    }
}
