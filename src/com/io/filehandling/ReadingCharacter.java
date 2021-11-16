package com.io.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter value for Character reading");
        System.out.println("Enter 'q' for exit");
        char c;
        do {
            c = (char)br.read();         // read only one character
            System.out.println("Value is: "+c);
        }while (c != 'q');
    }
}
