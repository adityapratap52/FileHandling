package com.io.filehandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.write(100);
        pw.write('c');
        pw.write("Ram");
        pw.println(100);
        pw.println(100.12);
        pw.println(true);
        pw.println("Shyam");

        pw.flush();
        pw.close();
        System.out.println("Successful");
    }
}
