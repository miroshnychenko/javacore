package com.serhii.runners.classwork.lesson8;

public class Loops {

    public static void main(String[] args) {
        int a = 10;
        int b = 1;

        while (a>b){
            a--;
            System.out.println("A = " + a + ", B = " + b);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
