package com.rohinisha.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUpdates {

    public static void main(String[] args) throws IOException {

        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Hello Naresh");

        System.out.println(path);
        System.out.println(Files.readString(path));
            
    }
}
