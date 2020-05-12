package com.endava;


public class Main {

    public static void main(String[] args) {
        Student<Integer> student = new Student<>(10, 10, 10);
        Student<String> studentStr = new Student<>("10", "Irina", "student");
        Student<SuperClass> studentClass = new Student<>(new SuperClass(), new SuperClass(), new SuperClass());
        student.setName(10);
        studentStr.setName("Irina");
        System.out.println(studentClass.getName());
    }

    static class SuperClass {
        public String toString() {
            return "super";
        }

    }

}
