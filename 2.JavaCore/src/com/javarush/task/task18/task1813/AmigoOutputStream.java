package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    private FileOutputStream fos;

    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream (FileOutputStream fos) throws FileNotFoundException, IOException{
        super(fileName);
        this.fos = fos;
    }
    public void write(int b) throws IOException{
        this.fos.write(b);
    }
    public void write(byte[] b) throws IOException{
        this.fos.write(b);
    }
    public void write(byte[] b, int off, int len) throws IOException{
        this.fos.write(b, off, len);
    }
    public void flush() throws IOException {
        this.fos.flush();
    }
    public void close() {
        try {
            this.fos.flush();
            this.fos.write("JavaRush © All rights reserved.".getBytes());
            this.fos.close();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }


    public static void main(String[] args) throws FileNotFoundException, IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
