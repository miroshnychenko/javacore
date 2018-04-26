package com.serhii.runners.classwork.lesson13;

import com.serhii.app.classwork.lesson13.equals.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(10, 20, 30);
        Laptop laptop2 = new Laptop(20, 10, 40);
        Laptop laptop3 = new Laptop(10, 20, 10);

        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop1.equals(laptop3));
        System.out.println(laptop2.equals(laptop1));
        System.out.println(laptop3.equals(laptop1));
    }
}
