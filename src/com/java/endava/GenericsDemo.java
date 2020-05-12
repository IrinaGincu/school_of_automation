package com.java.endava;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        List<Integer> generics = new ArrayList();
        generics.add(10);

        for (int i = 0; i <= generics.size(); i++) {
            System.out.println(generics.get(i) * 2);
        }

    }
}
