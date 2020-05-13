package com.endava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedWildCarExamples {
    public static void main(String[] args) {

        //Upper Bounded Integer List
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        //printing the sum of elements in list
        print(list1);

        //Double list
        //Float list
        List<Float> list2 = Arrays.asList(4.16f, 5.1f, 6.1f);
        List<Double> list3 = Arrays.asList(4.16, 5.1, 6.1);

        //printing the sum of elements in list
        print(list2);
        print(list3);
    }

    private static void print(List<?> list) {
        System.out.println(list);

    }
}

