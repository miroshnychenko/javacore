package com.serhii.app.homework.lesson8.utils;

public class Lesson8Utils {

    public static int generateNumber(int maxNumber) {
        return (int) (Math.random() * (maxNumber)) + 1;

    }

    public static int generateNumberInRange(int minNumber, int maxNumber) {
        return (int) (Math.random() * (maxNumber - minNumber + 1)) + minNumber;

    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        return max;
    }
}
