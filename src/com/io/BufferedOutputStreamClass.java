package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file3.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String s = "Welcome Back";
        byte []b = s.getBytes();
        bos.write(b);
        bos.write(100);
        bos.flush();
        bos.close();
        fos.close();
        System.out.println("Success");
    }
}
