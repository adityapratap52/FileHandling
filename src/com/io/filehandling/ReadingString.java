package com.io.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
//        System.out.println("Enter value for String reading");
//        System.out.println("Enter 'stop' for exit");
//        String s;
//        do {
//            s = br.readLine();           // read one line
//            System.out.println(s);
//        }while (!s.equals("stop"));
         */

        System.out.println("Enter 'stop' for exit");
        String []strings = new String[100];
        for (int i=0; i<100; i++){
            strings[i] = br.readLine();
            if (strings[i].equals("stop")) break;
        }
        for (int i=0; i<100; i++){
            if (strings[i].equals("stop")) break;
            System.out.println(strings[i]);
        }
    }
}
