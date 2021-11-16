package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file3.txt");
        fos.write(100);
        String s = "Welcome back";
        byte []b = s.getBytes();        // converting string into byte
        fos.write(b);
        fos.close();
        System.out.println("Success");
    }
}
