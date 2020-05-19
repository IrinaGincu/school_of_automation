package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

    public static void main(String[] args) throws IOException {

        //declare files
        FileInputStream inFile = null;
        FileOutputStream outFile = null;

        try {
            inFile = new FileInputStream("src/inputFile.txt");
            outFile = new FileOutputStream("src/outPutFile.txt");

            // read file
            int c;
            while ((c = inFile.read()) != -1) {
                // write in file
                outFile.write(c);
            }
            System.out.println(inFile.toString());

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File nt found");
        } finally {
            //close files
            if (inFile != null)
                inFile.close();

            if (outFile != null)
                outFile.close();
        }
    }
}

