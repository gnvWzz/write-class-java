package com.codegym;

public class Student {
    private static String name = "John";
    private static String classes = "C02";

    public Student() {
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static void setClasses(String classes) {
        Student.classes = classes;
    }

}
