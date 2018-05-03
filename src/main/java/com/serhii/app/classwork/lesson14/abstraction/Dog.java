package com.serhii.app.classwork.lesson14.abstraction;

public class Dog extends Animal {

    public Dog(String name, int age, String type) {
        super(name, age, type);
        super.hasLegs = true;
    }

    @Override
    public void speak() {
        System.out.println("Woof-Woof!");
    }

    @Override
    public void move() {
        System.out.println("Dog is walking");
    }
}
