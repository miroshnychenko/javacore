package com.serhii.app.homework.lesson8;

import com.serhii.app.homework.lesson8.utils.Lesson8Utils;

public class ArrayLoopsHomework {

    public String toString(int[] array) {
        StringBuilder arrayToString = new StringBuilder();
        for (int element : array) {
            arrayToString = arrayToString.append(element).append(" ");
        }
        return arrayToString.toString();
    }

    public String toString(int[][] array) {
        StringBuilder result = new StringBuilder();
        for (int[] arr : array) {
            result = result.append(toString(arr)).append("\n");
        }
        return result.toString();
    }

    public String toColumn(int[] array) {
        StringBuilder arrayToColumn = new StringBuilder();
        for (int element : array) {
            arrayToColumn = arrayToColumn.append(element).append("\n");
        }
        return arrayToColumn.toString();
    }

    public int[] generateRandomArray(int length, int minNumber, int maxNumber) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Lesson8Utils.generateNumberInRange(minNumber, maxNumber);
        }
        return array;
    }

    public int[] generateOddArray(int length) {
        int[] array = new int[length];
        int number = -1;
        for (int i = 0; i < array.length; i++) {
            number = number + 2;
            array[i] = number;
        }
        return array;
    }

    public int[][] generateTwoDimensionalArray(int rows, int colums, int minNumber, int maxNumber) {
        int[][] array = new int[rows][colums];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Lesson8Utils.generateNumberInRange(minNumber, maxNumber);
            }
        }
        return array;
    }

    public int[] reverseArray(int[] array) {
        int counter = 0;
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[counter] = array[i];
            counter++;
        }
        return reversedArray;
    }

    public int countEven(int[] array) {
        int evenCount = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public String matrixToFormattedString(int[][] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {

                result = result.append(String.format("%3d ", array[i][j]));
            }
            result = result.append("\n");
        }
        return result.toString();
    }

}
