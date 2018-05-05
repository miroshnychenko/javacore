package com.serhii.app.homework.lesson13.flower;

import java.util.Objects;

public class Flower {
    public Integer price;

    public Flower(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(price, flower.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(price);
    }
}
