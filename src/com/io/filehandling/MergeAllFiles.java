package com.io.filehandling;

import java.io.*;

public class MergeAllFiles {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("file3.txt");
        File f = new File("/home/adi/Desktop/adi123");
        String []store = f.list();

        for (String store1 : store){
            File f1 = new File(f,store1);
            if (f1.isFile()){
                BufferedReader br = new BufferedReader(new FileReader(f1));
                String line = br.readLine();
                while (line != null){
                    pw.println(line);
                    line = br.readLine();
                }
            }
        }
        System.out.println("Successful");
        pw.flush();
        pw.close();
    }
}
