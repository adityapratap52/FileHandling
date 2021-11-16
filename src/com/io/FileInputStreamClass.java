package com.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file3.txt");

        int value = fis.read();
        while (value != -1){
            System.out.print((char)value);
            value = fis.read();
        }

        fis.close();
    }
}
