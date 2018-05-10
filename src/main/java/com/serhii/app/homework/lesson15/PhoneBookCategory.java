package com.serhii.app.homework.lesson15;

import com.serhii.app.classwork.lesson13.composition.Phone;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookCategory {
    String name;
    Map<String, String> phoneBookCategory = new HashMap<>();

    public PhoneBookCategory(String name) {
        this.name = name;
    }

    public void addContact(String name, String phone) {
        this.phoneBookCategory.put(name, phone);
    }

    public void changeContactName(String oldName, String newName) {
        String obj = phoneBookCategory.remove(oldName);
        phoneBookCategory.put(newName, obj);
    }

    public void changePhoneNumber(String name, String phone) {
        phoneBookCategory.put(name, phone);
    }

    @Override
    public String toString() {
        return ("Category name: " + name + "\n" + phoneBookCategory + "\n").replace("[", "")
                .replace("]", "");

    }
}
