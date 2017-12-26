package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        //String disk = "d:\\";
        //String type = ".txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();


        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileOne)));
        PrintWriter printWriter = new PrintWriter(fileTwo);
        String[] numbers = fileReader.readLine().split(" ");
        double d;
        for (String numb : numbers) {
            d = Double.parseDouble(numb);
            //System.out.println(numb + " - "+ d + " - " + Math.round(d));
            printWriter.write(Math.round(d) + " ");
        }
        reader.close();
        fileReader.close();
        printWriter.close();



    }

    //public byte[] byteRoundToByte ()
}
