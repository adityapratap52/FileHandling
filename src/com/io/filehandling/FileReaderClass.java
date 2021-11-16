package com.io.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");

//        int value = fr.read();
//        while (value != -1){
//            System.out.print((char)value);
//            value = fr.read();
//        }
//        fr.close();


//-------------------------------------------------------------------------------
        File f = new File("abc.txt");
        char []values = new char[(int)f.length()];
        int store = fr.read(values);
        System.out.println(store);
        for (char ch : values){
            System.out.print(ch);
        }
        fr.close();
    }
}
