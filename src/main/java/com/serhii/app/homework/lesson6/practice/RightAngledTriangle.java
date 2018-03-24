package com.serhii.app.homework.lesson6.practice;

public class RightAngledTriangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public boolean isRightAngled() {
        return Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2);
    }

    public String isRightAngledToConsole() {
        if (isRightAngled()) {
            return "Triangle is right angled";
        } else {
            return "Triangle is not right angled";
        }
    }
}
