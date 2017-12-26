package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream{

    public TxtInputStream(String fileName)  throws FileNotFoundException, UnsupportedFileNameException, IOException {
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
            /*try {


            } catch (UnsupportedFileNameException ufn) {
            ufn.printStackTrace();
        } finally {
                try {

                } catch (IOException iex) {
                iex.printStackTrace();
            }
            }
        }*/



    }


    public static void main(String[] args) {
    }
}

