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

    public Flower[] sell(int countRose, int countTulip, int countChamomile) {
        int count = countRose + countTulip + countChamomile;
        flowers = new Flower[count];
        for (int i = 0; i < count; i++) {
            if (i < countRose) {
                flowers[i] = new Rose();
                purse += flowers[i].getPrice();
            } else if (i < (countTulip + countRose)) {
                flowers[i] = new Tulip();
                purse += flowers[i].getPrice();
            } else {
                flowers[i] = new Chamomile();
                purse += flowers[i].getPrice();
            }
        }
        return flowers;
    }

    public Flower[] sellSequence(int countRose, int countTulip, int countChamomile) {
        int count = countRose + countTulip + countChamomile;
        flowers = new Flower[count];
        for (int i = 0; i < count; ) {
            if (countRose > 0) {
                flowers[i] = new Rose();
                purse += flowers[i++].getPrice();
                countRose--;
            }
            if (countTulip > 0) {
                flowers[i] = new Tulip();
                purse += flowers[i++].getPrice();
                countTulip--;
            }
            if (countChamomile > 0) {
                flowers[i] = new Chamomile();
                purse += flowers[i++].getPrice();
                countChamomile--;
            }
        }
        return flowers;
    }

    public void showBouquet(Flower[] flowers) {
        String[] names = new String[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            names[i] = flowers[i].name();
        }
        System.out.println(Arrays.toString(names));
    }
}
