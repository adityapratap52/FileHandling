package com.io;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamClass {
    public static void main(String[] args) throws IOException {

                    //------------by two classes---------------------
//        FileInputStream input1 = new FileInputStream("file1.txt");
//        FileInputStream input2 = new FileInputStream("file2.txt");
//        SequenceInputStream inst = new SequenceInputStream(input1,input2);
//        FileOutputStream fos = new FileOutputStream("file3.txt");
//        int value;
//        while ((value = inst.read()) != -1){
//            System.out.print((char)value);
//            fos.write(value);
//        }
//        fos.close();
//        inst.close();
//        input1.close();
//        input2.close();


                    //---------------Using Enumeration for using two or more class------------------
        FileInputStream input1 = new FileInputStream("file1.txt");
        FileInputStream input2 = new FileInputStream("file2.txt");

        Vector v = new Vector();
        v.add(input1);
        v.add(input2);

        Enumeration e = v.elements();
        SequenceInputStream sis = new SequenceInputStream(e);
        int i=0;
        while ((i=sis.read()) != -1){
            System.out.print((char)i);
        }
        sis.close();
        input1.close();
        input2.close();
    }
}
