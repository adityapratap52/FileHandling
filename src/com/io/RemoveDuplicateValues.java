package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicateValues {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        String line = br1.readLine();
        while (line != null){
            boolean available = false;
            BufferedReader br2 = new BufferedReader(new FileReader("file3.txt"));
            String target = br2.readLine();
            while (target != null){
                if (line.equals(target)){
                    available = true;
                    break;
                }
                target = br2.readLine();
            }
            if (available == false){
                pw.println(line);
                pw.flush();
            }
            line = br1.readLine();
        }
        pw.close();
        System.out.println("Successful");
    }
}
