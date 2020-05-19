package com.java.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter something");
//        in.nextLine();
        FileWriter out = new FileWriter("outputFiile.txt");
        out.write(in.nextLine());
        out.close();


    }
}
