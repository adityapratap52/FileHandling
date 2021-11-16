package com.io.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        bw.write('a');
        bw.newLine();
        bw.write("abcd");
        bw.newLine();

        char []ch = {'h','e','l','l','o'};
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
