package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicOfIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b;
        b= 'A';
        System.out.println((char)b);
                //----OR----
//        System.out.write(b);
//        System.out.write('\n');
    }
}
