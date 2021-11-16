package com.io.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteParticularValues {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line != null){
            BufferedReader br1 = new BufferedReader(new FileReader("delete.txt"));
            String target = br1.readLine();
            boolean available = false;
            while (target != null){
                if (line.equals(target)){
                    available = true;
                    break;
                }
                target = br1.readLine();
            }
            if (available == false){
                pw.println(line);
            }
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        System.out.println("Successful");
    }
}
