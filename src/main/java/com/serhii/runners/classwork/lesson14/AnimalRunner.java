package com.serhii.runners.classwork.lesson14;

import com.serhii.app.classwork.lesson14.abstraction.Animal;
import com.serhii.app.classwork.lesson14.abstraction.Cat;
import com.serhii.app.classwork.lesson14.abstraction.Dog;
import com.serhii.app.classwork.lesson14.abstraction.Snake;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal cat = new Cat("Murik", 5, "cat", 15);
        Animal dog = new Dog("Bobik", 3, "dog");
        Animal snake = new Snake("Snake", 10, "snake", 4);

        Animal[] animals = {cat, dog, snake};

        for (Animal animal : animals) {
            animal.move();
            animal.speak();
        }
    }
}
