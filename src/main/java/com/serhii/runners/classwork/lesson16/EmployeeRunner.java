package com.serhii.runners.classwork.lesson16;

import com.serhii.app.classwork.lesson16.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Petr", 20);
        Employee employee2 = new Employee("Vasiliy", 30);
        Employee employee3 = new Employee("Kolia", 19);
        Employee employee4 = new Employee("Andrey", 45);

        ArrayList <Employee> employees = new ArrayList<>();
        employees.add(employee4);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee1);

        Employee[] employees1 = {employee4,employee2,employee3, employee1};
        Arrays.sort(employees1, new Employee());

        Collections.sort(employees);

        System.out.println(Arrays.toString(employees1));

        System.out.println(employees);

    }
}
