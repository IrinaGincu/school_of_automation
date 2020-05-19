package com.java.files;

import java.io.File;
import java.io.IOException;


public class FilesIO {

    public static void main(String[] args) throws IOException {
        File file = new File("src/newFile.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.delete());

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists!");
        }
    }
}

