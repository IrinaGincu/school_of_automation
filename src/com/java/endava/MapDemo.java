package com.java.endava;

import sun.awt.image.ImageWatched;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> cars  = new HashMap<>();
        cars.put(1,"Mercedes");
        cars.put(2,"VW");
        cars.put(3,"Audi");
        cars.put(3,"Toyota");
        System.out.println(cars.size());
        for (int id: cars.keySet()){
            System.out.println(id + " " + cars.get(id));
        }

        cars.clear();

        List<Integer> my = new ArrayList<>();
        List<Integer> myAr = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[10];
    }





}
