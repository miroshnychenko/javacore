package com.serhii.app.homework.lesson13.flower;

public class Bouquet {
    private Flower[] flowers;
    private int price;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
        for (Flower flower : flowers) {
            this.price += flower.price;
        }
    }

    public int getPrice() {
        return price;
    }
}
