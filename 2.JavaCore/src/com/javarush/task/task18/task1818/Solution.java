package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        String fileThree = reader.readLine();
        reader.close();
        FileOutputStream fosOne = new FileOutputStream(fileOne);
        FileInputStream fisTwo = new FileInputStream(fileTwo);
        FileInputStream fisThree = new FileInputStream(fileThree);
        while (fisTwo.available() > 0){
            int bt = fisTwo.read();
            fosOne.write(bt);
        }
        byte[] threeBuff = new byte[fisThree.available()];
        int bt = fisThree.read(threeBuff);
        fosOne.write(threeBuff);
        /*while (fisThree.available() > 0){
            int bt = fisThree.read();
            fosOne.write(bt);
        }*/
        fosOne.close();
        fisTwo.close();
        fisThree.close();
    }
}
