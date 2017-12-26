package com.javarush.task.task17.task1710;

import javafx.scene.input.DataFormat;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.util.Locale;

/* 
CRUD
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id

Значения параметров:
name — имя, String
sex — пол, «м» или «ж», одна буква
bd — дата рождения в следующем формате 15/04/1990
-c — добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u — обновляет данные человека с данным id
-d — производит логическое удаление человека с id, заменяет все его данные на null
-i — выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
id соответствует индексу в списке

Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -і:
Миронов м 15-Apr-1990
*/


public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    /*
Требования:
1. Класс Solution должен содержать public static поле allPeople типа List.
2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
3. При запуске программы с параметром -с программа должна добавлять человека с заданными параметрами в конец списка allPeople, и выводить id (index) на экран.
4. При запуске программы с параметром -u программа должна обновлять данные человека с заданным id в списке allPeople.
5. При запуске программы с параметром -d программа должна логически удалять человека с заданным id в списке allPeople.
6. При запуске программы с параметром -i программа должна выводить на экран данные о человеке с заданным id по формату указанному в задании.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
*/

    public static void main(String[] args) {
        //start here - начни тут
        switch(args[0]) {
            case "-c" : {
                try{
                    SimpleDateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");
                    if (args[2].equals("м")) allPeople.add(Person.createMale((args[1]), dateIn.parse(args[3])));
                    else if (args[2].equals("ж")) allPeople.add(Person.createFemale((args[1]), dateIn.parse(args[3])));
                    else System.out.println("Неверно указан пол");
                    System.out.println(allPeople.size()-1);
                }
                catch (ParseException pe){
                    pe.printStackTrace();
                }
                break;
            }
            case "-u" :{
                try{
                    SimpleDateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");
                    if (args[3].equals("м")) allPeople.set(Integer.parseInt(args[1]), Person.createMale((args[2]), dateIn.parse(args[4])));
                    else if (args[3].equals("ж")) allPeople.set(Integer.parseInt(args[1]), Person.createFemale((args[2]), dateIn.parse(args[4])));
                    else System.out.println("Неверно указан пол");
                }
                catch (ParseException pe){
                    pe.printStackTrace();
                }
                break;
            }
            case "-d" :{
                int id = Integer.parseInt(args[1]);
                Person nullMan = allPeople.get(id);
                nullMan.setBirthDay(null);
                nullMan.setName(null);
                nullMan.setSex(null);
                allPeople.set(id, nullMan);
                break;
            }

            /*Пример вывода для параметра -і:
Миронов м 15-Apr-1990
*/
            case "-i" :{
                SimpleDateFormat dateOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                Person thisPerson = allPeople.get(Integer.parseInt(args[1]));
                System.out.println(thisPerson.getName() + " " + returneSex(thisPerson.getSex()) + " " + dateOut.format(thisPerson.getBirthDay()));
                break;
            }
            default:
                System.out.println("Команда не распознана");
                break;
        }

    }

    public static String returneSex (Sex sex) {
        if (sex == Sex.MALE) return "м";
        else if (sex == Sex.FEMALE) return "ж";
        else return null;
    }
}
