package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла — в allLines, из второго — в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //1. Считать с консоли 2 имени файла
            String file1 = reader.readLine();
            String file2 = reader.readLine();

            //2. Считать построчно данные из файлов. Из первого файла — в allLines, из второго — в forRemoveLines
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
            String line = "";
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                allLines.add(line);
            }
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
            line = "";
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                forRemoveLines.add(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException ce) {
            ce.printStackTrace();
        }

    }
    //7. Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержаться все строки из списка forRemoveLines.
//8. Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержаться все строки из списка forRemoveLines.
//9. Метод joinData должен вызываться в main.

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            Solution.allLines.removeAll(Solution.forRemoveLines);
        }
        else {
            Solution.allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
