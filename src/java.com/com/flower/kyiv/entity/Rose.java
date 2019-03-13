package com.flower.kyiv.entity;

public class Rose extends Flower {
    private static final int PRICE = 100;

    public Rose() {
        super(PRICE);
    }

    @Override
    public String name() {
        return "rose";
    }
}
