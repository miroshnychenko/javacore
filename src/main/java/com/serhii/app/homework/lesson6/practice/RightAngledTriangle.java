package com.serhii.app.homework.lesson6.practice;

public class RightAngledTriangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public RightAngledTriangle() {
    }

    public RightAngledTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public boolean isRightAngled(){
        return Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2);
    }

    public void isRightAngledToConsole(){
        if (Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2)){
            System.out.println("Triangle is right angled");
        } else {
            System.out.println("Triangle is not right angled");
        }
    }
}
