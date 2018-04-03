package com.serhii.runners.homework.lesson8;

import com.serhii.app.homework.lesson8.ArrayLoopsHomework;
import com.serhii.app.homework.lesson8.utils.Lesson8Utils;

public class ArrayLoopsHomeworkRunner {

    public static void main(String[] args) {
        System.out.println("Part 1");
        ArrayLoopsHomework arrayLoops = new ArrayLoopsHomework();
        int[] evenArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.println(arrayLoops.toString(evenArray));
        System.out.println(arrayLoops.toColumn(evenArray));

        System.out.println("--------------------");

        System.out.println("Part 2");
        int[] oddArray = arrayLoops.generateOddArray(50);
        int[] reversedOddArray = arrayLoops.reverseArray(oddArray);
        System.out.println(arrayLoops.toString(oddArray));
        System.out.println(arrayLoops.toString(reversedOddArray));

        System.out.println("--------------------");

        System.out.println("Part 3");

        int[] randomArray = arrayLoops.generateRandomArray(15, 1, 9);

        System.out.println(arrayLoops.toString(randomArray));
        System.out.println("Array contains " + arrayLoops.countEven(randomArray) + " even numbers");

        System.out.println("--------------------");

        System.out.println("Part 4");

        int[] randomArray2 = arrayLoops.generateRandomArray(15, 0, 999);
        System.out.println(arrayLoops.toString(randomArray2));
        System.out.println("Max number is: " + Lesson8Utils.getMax(randomArray2));
        System.out.println("Min number is: " + Lesson8Utils.getMin(randomArray2));

        System.out.println("--------------------");

        System.out.println("Part 5");

        int[][] twoDimensionalArray = arrayLoops.generateTwoDimensionalArray(8, 5, 10, 99);
        System.out.println(arrayLoops.toString(twoDimensionalArray));
        System.out.println("--------------------");

        System.out.println("Part 6");

        int[][] twoDimensionalArray2 = arrayLoops.generateTwoDimensionalArray(8, 5, 1, 999);
        System.out.println(arrayLoops.matrixToFormattedString(twoDimensionalArray2));

    }
}
