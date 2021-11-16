package com.io;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos1 = new FileOutputStream("file2.txt");
        FileOutputStream fos2 = new FileOutputStream("file3.txt");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(65);
        bos.writeTo(fos1);
        bos.writeTo(fos2);

        bos.flush();
        bos.close();
        System.out.println("Success");
    }
}
