package com.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesNio {

    public static void main(String[] args) throws IOException {

        Path fileI = Paths.get("newInputFile.txt");
        Path fileO = Paths.get("newOutPutFile.txt");
//            Files.createFile(fileI);
//            Files.createFile(fileO);
//        Files.copy(fileI, fileO);
//        Files.delete(fileI);
        Files.createDirectory(Paths.get("testDirectory"));

    }
}
