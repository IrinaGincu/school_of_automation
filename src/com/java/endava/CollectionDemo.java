package com.java.endava;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(40);
        myArray.add(30);
        myArray.add(50);
        myArray.remove(2);
        System.out.println(myArray.get(1));
        System.out.println(myArray.size());
        System.out.println(myArray.contains(50));
        System.out.println(myArray.indexOf(30));
        System.out.println(myArray.toArray());
        for (int e : myArray)
            System.out.println(e);
        System.out.println("-----------------------------");
        System.out.println(myArray.set(0, 20));
        for (int e : myArray)
            System.out.println(e);
        System.out.println("--------------------------------");
        System.out.println(myArray.indexOf(20));

        myArray.clear();
        System.out.println(myArray);
    }

}
