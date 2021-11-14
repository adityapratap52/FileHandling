package com.io;

import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        int value = 12;
        double price = 4.5e-7;
        pw.println(value);
        pw.println(price);
        pw.close();
    }
}
