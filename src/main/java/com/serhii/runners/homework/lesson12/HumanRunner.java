package com.serhii.runners.homework.lesson12;

import com.serhii.app.homework.lesson12.Human;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human("Vasia", 30);
        human.setAge(0);
        human.setAge(200);
        human.setAge(40);
        System.out.println(human.getName());
        System.out.println(human.getAge());
    }
}
