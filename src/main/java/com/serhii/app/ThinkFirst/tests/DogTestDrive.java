package com.serhii.app.ThinkFirst.tests;

import com.serhii.app.ThinkFirst.app.Dog;

public class DogTestDrive {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.size = 40;
        dog.name = "Bart";
        dog.bark();

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog;

        myDogs[0].name = "Fred";
        myDogs[1].name = "George";

        System.out.println("Last dog name");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }


    }
}
