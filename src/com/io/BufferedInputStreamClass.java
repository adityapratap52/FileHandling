package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file3.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int value = bis.read();
        while (value != -1){
            System.out.print((char)value);
            value = bis.read();
        }
        bis.close();
        fis.close();
    }
}
