package com.serhii.app.homework.lesson15;

import com.serhii.app.classwork.lesson13.composition.Phone;

import java.util.HashMap;
import java.util.Map;

public class Checkers {

    public static void main(String[] args) {
        /*Map map = new HashMap();

        map.put("Key1", "Val1");
        map.put("Key2", "Val2");
        map.put("Key3", "Val3");


        Object obj = map.remove("Key1");

        map.put("Key4", obj);
        System.out.println(map);

        System.out.println(map.keySet());*/

        PhoneBook book = new PhoneBook();
        PhoneBookCategory firstCategory = new PhoneBookCategory("Friends");
        PhoneBookCategory secondCategory = new PhoneBookCategory("Colleagues");


        firstCategory.addContact("Vasia", "0987654321");
        firstCategory.addContact("Petro", "1234567890");
        secondCategory.addContact("Ivan", "0192837465");
        secondCategory.addContact("Misha", "6758493021");

        book.addCategory(firstCategory);
        book.addCategory(secondCategory);

        System.out.println(book);

        System.out.println(book.showCategory("Friends"));
        System.out.println(book.showCategory("qwe"));

        System.out.println(book);

        book.showCategory("Friends");

        book.showCategory("qwe").addContact("Sergey", "32123");
        System.out.println(book.showCategory("qwe"));

    }

}
