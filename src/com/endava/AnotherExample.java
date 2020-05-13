package com.endava;

import java.util.Arrays;
import java.util.List;

public class AnotherExample {

    static class Animal {
        String animal;

        @Override
        public String toString() {
            return "animal";
        }
    }

    static class Cat extends Animal {
        String animal;

        @Override
        public String toString() {
            return "cat";
        }
    }

    static class DomesticCat extends Cat {

        String animal;

        @Override
        public String toString() {
            return "domesticCat";
        }
    }

    static void print(List<? super Cat> list){
        System.out.println("Print " + list);

    }
    public static void main(String[] args) {
        List<DomesticCat> x = Arrays.asList(new DomesticCat());
        List<Cat> y = Arrays.asList(new Cat());
        List<Animal> z = Arrays.asList(new Animal());
//        print(x);
        print(y);
        print(z);
    }

}
