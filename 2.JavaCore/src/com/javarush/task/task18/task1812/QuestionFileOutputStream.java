package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream aos;

    public QuestionFileOutputStream(AmigoOutputStream inaos) {
        this.aos = inaos;
    }

    public void close(){
        try {
            System.out.println("Вы действительно хотите закрыть поток? Д/Н");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            if (br.readLine().equals("Д")) this.aos.close();
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void flush() throws IOException {
        this.aos.flush();
    }

    public void write(int b) throws IOException{
        this.aos.write(b);
    }

    public void write(byte[] b) throws IOException {
        this.aos.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        this.aos.write(b, off, len);
    }


}

