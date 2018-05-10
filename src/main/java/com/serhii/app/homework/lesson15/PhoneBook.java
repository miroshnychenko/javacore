package com.serhii.app.homework.lesson15;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<PhoneBookCategory> phoneBookCategories = new ArrayList<>();

    public PhoneBookCategory showCategory (String categotyName) {
        for (PhoneBookCategory category : phoneBookCategories) {
            if (category.name.equals(categotyName)) {
                return category;

            }
        }
        PhoneBookCategory category = new PhoneBookCategory(categotyName);
        phoneBookCategories.add(category);
        return category;
    }

    public void addCategory(PhoneBookCategory category) {
        phoneBookCategories.add(category);
    }

    @Override
    public String toString() {
        return ("" + phoneBookCategories).replace("[", "")
                .replace("]", "");
    }

}
