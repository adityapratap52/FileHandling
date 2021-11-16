package com.io.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {

        int i;
//        FileInputStream fis;
        //First conform that a filename has been specified
        if (args.length != 1){
            System.out.println("Usage: ShowFile fileName");
            return;
        }
        // Attempt to open the file
        try (var fis = new FileInputStream(args[0])){
        }catch (FileNotFoundException e){
            System.out.println("Can't open file");
            return;
        }

        // At this point, the file is open and can be read
        // The following reads until EOF is encountered
//        try {
//            do {
////                i = fis.read();
//                if (i != -1) System.out.println((char) i);
//            }while (i != -1);
//        }catch (IOException e){
//            System.out.println("IOException Occur");
//        }finally {      // close the file
//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
