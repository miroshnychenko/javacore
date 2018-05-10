package com.serhii.app.homework.lesson15;

import com.serhii.app.classwork.lesson13.composition.Phone;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookCategories {
    Map<String, PhoneBookContacts> phoneBookCategories = new HashMap<>();
    PhoneBookContacts contacts;

    public void showAllCategories() {
        for (int i = 0; i < phoneBookCategories.size(); i++) {
            System.out.println(phoneBookCategories.keySet());
        }
    }

    public void showCategory(String categoryName) {
        if (!phoneBookCategories.containsKey(categoryName)) {
            createNewCategory(categoryName);
        } else {
            System.out.println(phoneBookCategories.get(categoryName));
        }
    }

    private void createNewCategory(String categoryName) {
        phoneBookCategories.put(categoryName, contacts);
    }
}
