package com.java.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/inputFile.txt"));
        String strCurrentLine;
        while ((strCurrentLine = bufferedReader.readLine()) != null) {
            System.out.println(strCurrentLine);
        }
        bufferedReader.close();
    }
}
