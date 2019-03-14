package com.flower.kyiv.entity;

public class Chamomile extends Flower {
    private static final int PRICE = 70;

    public Chamomile() {
        super(PRICE);
    }

    @Override
    public String toString() {
        return "chamomile";
    }
}
