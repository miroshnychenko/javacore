package com.serhii.app.homework.lesson4.utils.convertors;

public class PrimitiveConvertor {

    //floatToChar, intToChar, charToInt,
    public void floatToChar (float number) {
        char convertResult = (char) number;
        System.out.println("Input float value is " + number + ". Output char value is " + convertResult);
    }

    public void intToChar (int number) {
        char convertResult = (char) number;
        System.out.println("Input int value is " + number + ". Output char value is " + convertResult);
    }

    public void charToInt (char charToConvert) {
        int convertResult = (int) charToConvert;
        System.out.println("Input char value is " + charToConvert + ". Output int value is " + convertResult);
    }
}
