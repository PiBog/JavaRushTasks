package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;

public class Solution {
    public static void main(String[] args1) throws Exception {

        //String[] args = new String[] {"-u","198479","cccccccccccccccccccccccccccccccccc","33", "44"};
        String[] args = new String[] {"-d","198479"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName = reader.readLine();
        File tmpFile = File.createTempFile(fName, ".tmp");
        if (args[0].equals("-u")) crudUpd(fName, args);
        if (args[0].equals("-d")) crudDel(fName, args);
        reader.close();
    }

    public static void crudUpd(String fName, String[] args) throws IOException{
        File tmpFile = new File(fName + ".tmp");
        tmpFile.createNewFile();
        String serchID = fillAndTrim(args[1], 8);
        String lineToWrite = serchID + fillAndTrim(args[2], 30) + fillAndTrim(args[3], 8) + fillAndTrim(args[4], 4) + "\n";

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fName), "windows-1251"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tmpFile), "windows-1251"));
        String line, lineID ="";
        while ((line = reader.readLine())!= null){
            lineID = line.substring(0,8);
            if(lineID.equals(serchID)) {
                writer.write(lineToWrite, 0, lineToWrite.length());
            } else {
                lineID = line + "\n";
                writer.write(lineID, 0, lineID.length());
            }
        }
        reader.close();
        writer.close();

        File currentFile = new File(fName);
        currentFile.delete();
        tmpFile.renameTo(new File(fName));
    }

    public static void crudDel(String fName, String[] args) throws IOException{
        File tmpFile = new File(fName + ".tmp");
        tmpFile.createNewFile();
        String serchID = fillAndTrim(args[1], 8);

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fName), "windows-1251"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tmpFile), "windows-1251"));
        String line, lineID ="";
        while ((line = reader.readLine())!= null){
            lineID = line.substring(0,8);
            if(!lineID.equals(serchID)) {
                lineID = line + "\n";
                writer.write(lineID, 0, lineID.length());
            }
        }
        reader.close();
        writer.close();

        File currentFile = new File(fName);
        currentFile.delete();
        tmpFile.renameTo(new File(fName));
    }

    public static String fillAndTrim (String lineIn, int length){
        String line = lineIn;
        if (line.length() > length) {
            return line.substring(0, length);
        } else if (line.length() == length) {
            return line;
        }else {
            for (int i = line.length(); i < length ; i++){
                line += " ";
            }
            return line;
        }
    }


}
