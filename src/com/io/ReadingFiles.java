package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingFiles {
    public static void main(String[] args) {
        FileInputStream fis;
        try {
            fis = new FileInputStream("abc.txt");
        }catch (FileNotFoundException e){
            System.out.println("File is not found");
        }
    }
}
