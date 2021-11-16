package com.io.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

            //----------------Read data character by character--------------
//        int i = br.read();
//        while (i != -1){
//            System.out.print((char)i);
//            i = br.read();
//        }


        //----------------Read data Line by Line--------------
        String str = br.readLine();
        while (str != null){
            System.out.println(str);
            str = br.readLine();
        }
        br.close();
    }
}
