package com.java.endava;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudenComparator {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Irina", 1, "Chisinau"));
        students.add(new Student("Andrei", 2, "Chisinau"));
        students.add(new Student("Nicolae", 3, "Chisinau"));

        Collections.sort(students, new SortStudentObject());
        System.out.println(students);
    }
}
