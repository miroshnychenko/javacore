package com.serhii.app.classwork.lesson13.polymorphism;

public class BMV extends Car {

    public BMV() {
        name = "BMW";
        maxSpeed = 200;
    }

    @Override
    public void drive() {
        System.out.println("BMW drives");
    }
}
