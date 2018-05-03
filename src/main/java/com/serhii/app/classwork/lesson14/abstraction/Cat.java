package com.serhii.app.classwork.lesson14.abstraction;

public class Cat extends Animal {

    private int tailLength;

    public Cat(String name, int age, String type, int tailLenght) {
        super(name, age, type);
        super.hasLegs = true;
        this.tailLength = tailLenght;
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("Cat is walking.");
    }
}
