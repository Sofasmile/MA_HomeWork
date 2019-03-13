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

    private void addMoney(int countRose, int countTulip, int countChamomile) {
        purse += new Rose().getPrice() * countRose
                + new Chamomile().getPrice() * countChamomile
                + new Tulip().getPrice() * countTulip;
    }

    public Flower[] sell(int countRose, int countTulip, int countChamomile) {
        int count = countRose + countTulip + countChamomile;
        flowers = new Flower[count];
        for (int i = 0; i < count; i++) {
            flowers[i] = (i < countRose) ? new Rose()
                    : (i < (countTulip + countRose)) ? new Tulip()
                    : new Chamomile();
        }
        addMoney(countRose, countTulip, countChamomile);
        return flowers;
    }

    public Flower[] sellSequence(int countRose, int countTulip, int countChamomile) {
        int count = countRose + countTulip + countChamomile;
        flowers = new Flower[count];
        addMoney(countRose, countTulip, countChamomile);
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
