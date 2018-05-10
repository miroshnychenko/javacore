package com.serhii.app.classwork.lesson16;

import java.util.Comparator;

public class Employee implements Comparator, Comparable{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee) o1;
        Employee employee2 = (Employee) o2;
        if (employee1.age > employee2.age) {
            return 1;
        } else if (employee1.age < employee2.age) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        if (employee.age < this.age) {
            return 1;
        } else if (employee.age > this.age) {
            return -1;
        } else return 0;
    }
}
