package com.java.endava;

public class Student {

    String name;
    int id;
    String addr;

    public Student(String name, int id, String addr) {
        this.name = name;
        this.id = id;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", addr='" + addr + '\'' +
                '}';
    }
}
