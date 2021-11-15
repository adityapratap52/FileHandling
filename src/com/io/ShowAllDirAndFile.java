package com.io;

import java.io.File;

public class ShowAllDirAndFile {
    public static void main(String[] args) {
        File file = new File("/home/adi/Desktop/adi123");
        String[] store = file.list();
        var count = 0;

                    //----------------show all files and dir----------------
//        for (String store1 : store){
//            System.out.println(store1);
//            count++;
//        }
//        System.out.println("Total files and subdirectory in adi: "+count);


                //----------------show all file only-------------------------
//        for (String store1 : store){
//            File file1 = new File(file,store1);
//            if (file1.isFile()) {
//                System.out.println(store1);
//                count++;
//            }
//        }
//        System.out.println("Total files in adi directory: "+count);


                //-----------------show all directory only--------------------
//        for (String store1 : store){
//            File file1 = new File(file,store1);
//            if (file1.isDirectory()) {
//                System.out.println(store1);
//                count++;
//            }
//        }
//        System.out.println("Total subDirectory in adi directory: "+count);


            //------------------Delete specified file-----------------------
        for (String store1 : store){
            File file1 = new File(file,store1);
            if (store1.equals("aa")) {
                file1.delete();
                count++;
                break;
            }
        }
        if (count == 1) System.out.println("aa dir is deleted");
        else System.out.println("No file is present of this name");
    }
}
