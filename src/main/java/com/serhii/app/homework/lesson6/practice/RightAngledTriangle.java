package com.serhii.app.homework.lesson6.practice;

public class RightAngledTriangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public void setSideA(String sideA) {
        this.sideA = Double.parseDouble(sideA);
    }

    public void setSideB(String sideB) {
        this.sideB = Double.parseDouble(sideB);
    }

    public void setSideC(String sideC) {
        this.sideC = Double.parseDouble(sideC);
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
