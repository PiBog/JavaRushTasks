package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово «exit«.
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String — это имя файла, параметр Integer — это искомый байт.
Закрыть потоки.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileList = new ArrayList<>();
        String line = "";
        while(!(line = reader.readLine()).equals("exit")){
            fileList.add(line);
        }

        for (String fileName : fileList){
            Thread thread = new ReadThread(fileName);
            thread.start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        public void run() {
            try {
                FileInputStream fis = new FileInputStream(this.fileName);
                Map<Integer, Integer> map = new HashMap<>();
                //int bigest = 1;
                while (fis.available() > 0) {
                    int i = fis.read();
                    if (!map.containsKey(i))
                        map.put(i, 1);
                    else {
                        //int cur = map.get(i) + 1;
                        //if (bigest < cur) bigest = cur;
                        map.put(i, map.get(i) + 1);
                    }
                }
                fis.close();
                resultMap.put(this.fileName, maxByte(map));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    public static int maxByte (Map<Integer, Integer> map){
        int maxFreq = Integer.MIN_VALUE;
        int maxBite = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int bite = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq){
                maxFreq = freq;
                maxBite = bite;
            }
        }

        return maxBite;
    }
}
