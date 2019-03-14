package com.flower.kyiv.entity;

public class Tulip extends Flower {
    private static final int PRICE = 45;

    public Tulip() {
        super(PRICE);
    }

    @Override
    public String toString() {
        return "tulip";
    }
}
