package com.flower.kyiv.entity;

public abstract class Flower {
    private static int price;
    public Flower(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public abstract String name();
}
