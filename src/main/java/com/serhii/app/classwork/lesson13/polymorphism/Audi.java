package com.serhii.app.classwork.lesson13.polymorphism;

public class Audi extends Car{

    public Audi() {
        name = "Audi";
        maxSpeed = 180;
    }

    @Override
    public void drive(){
        System.out.println("Audi drives");
    }
}
