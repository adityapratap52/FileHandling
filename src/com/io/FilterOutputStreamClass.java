package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FilterOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("file3.txt");
        FilterOutputStream filter = new FilterOutputStream(file);
        String s = "Welcome back";
        byte []b = s.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
        System.out.println("Success.....");
    }
}
