package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName; // = "d:\\java.txt";
    public static String secondFileName; // = "d:\\vaja.txt";

    //add your code here - добавьте код тут
    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    /*5. Метод run класса ReadFileThread должен считывать строки из файла, установленного методом setFileName.
    А метод getFileContent, этого же класса, должен возвращать вычитанный контент.
    Возвращаемое значение - это одна строка, состоящая из строк файла, разделенных пробелами.*7
     */

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fileName;
        private String fileContent ="";
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        public String getFileContent() {
            return fileContent;
        }

        @Override
        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(new File(fileName)));
                String line = "";
                while ((line = fileReader.readLine()) != null) {

                    fileContent +=  line + " ";
                }
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
