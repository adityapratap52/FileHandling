package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {

//        FileWriter fw = new FileWriter("abc.txt");      // Override operation
        FileWriter fw = new FileWriter("abc.txt",true);     // appending to data
        fw.write(97);
        fw.write('a');
        fw.write("di\nThis is my name");
        char []ch = {'\n','H','e','l','l','o'};
        fw.write(ch);
        fw.flush();
        fw.close();
        System.out.println("Text inserted successfully");
    }
}
