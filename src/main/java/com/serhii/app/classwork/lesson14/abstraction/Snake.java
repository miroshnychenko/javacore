package com.serhii.app.classwork.lesson14.abstraction;

public class Snake extends Animal {
    private int length;

    public Snake(String name, int age, String type, int length) {
        super(name, age, type);
        super.hasLegs = false;
        this.length = length;
    }

    @Override
    public void speak() {
        System.out.println("Ssssssss!");
    }

    @Override
    public void move() {
        System.out.println("Snake is crawling");
    }
}
