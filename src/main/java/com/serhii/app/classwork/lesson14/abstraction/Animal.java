package com.serhii.app.classwork.lesson14.abstraction;

public abstract class Animal {
    private String name;
    private int age;
    private String type;
    boolean hasLegs;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void speak();

    public abstract void move();

}
