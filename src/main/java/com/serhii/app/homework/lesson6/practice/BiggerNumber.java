package com.serhii.app.homework.lesson6.practice;

public class BiggerNumber {

    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    private boolean firstIsBigger(int number1, int number2) {
        return number1 > number2;
    }

    public String whatNumberIsBigger(int number1, int number2) {
        if (number1 == number2) {
            return "Numbers are equal";
        } else if (firstIsBigger(number1, number2)) {
            return "Number one is bigger";
        } else {
            return "Number two is bigger";
        }
    }
}
