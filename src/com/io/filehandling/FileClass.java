package com.io.filehandling;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {

                //----------For create file--------------------
//        File file = new File("abc.txt");
//        System.out.println(file.exists());          // false->true->.......
//                //create new physical file -> public boolean createNewFile
//        System.out.println(file.createNewFile());   // true->false->.......
//        System.out.println(file.exists());          // true->true->........

                //--------For create directory-----------
        File file1 = new File("/home/adi/Desktop/adi123");
        System.out.println(file1.exists());
        System.out.println(file1.mkdir());
        System.out.println(file1.exists());
    }
}
