package com.serhii.runners.classwork.lesson13;

import com.serhii.app.classwork.lesson13.equals.Student;

public class StudentsRunner {


    public static void main(String[] args) {
        Student stud1 = new Student("sa", 23, 3);
        Student stud2 = new Student("ca", 22, 1);
        Student stud3 = new Student("sa", 23, 6);
        Student stud4 = new Student("sa", 23, 6);

        System.out.println(stud1.equals(stud2));
        System.out.println(stud2.equals(stud3));
        System.out.println(stud3.equals(stud1));
        System.out.println(stud3.equals(stud4));
    }

}
