package com.io.filehandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file3.txt");
        DataOutputStream dos = new DataOutputStream(fos);
//        dos.write(65);
        dos.writeInt(66);
//        dos.writeByte(65);
        dos.flush();
        dos.close();
        System.out.println("Success....");
    }
}
