package com.io;

import java.io.*;

public class MergeFiles {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));

        String value = br.readLine();
        while (value != null){
            pw.println(value);
            value = br.readLine();
        }

        br = new BufferedReader(new FileReader("file2.txt"));

        value = br.readLine();
        while (value != null){
            pw.println(value);
            value = br.readLine();
        }

        br.close();
        pw.close();
        System.out.println("Successful");
    }
}
