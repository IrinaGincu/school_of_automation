package com.java.endava;

import javax.swing.plaf.IconUIResource;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        int[] count = {25,30,50,85,85};
        Set<Integer> set = new TreeSet<Integer>();
        for(int i =0; i<count.length; i++){
            set.add(count[i]);
        }
        System.out.println(set);

        set.clear();
        set.remove(2);

    }



}
