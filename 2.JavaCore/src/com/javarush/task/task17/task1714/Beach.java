package com.javarush.task.task17.task1714;

/* 
Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.
Реализовать метод compareTo так, чтобы он при сравнении двух пляжей выдавал число, которое показывает что первый пляж лучше(позитивное число)
или второй пляж лучше (негативное число),и насколько он лучше.


Требования:
1. Класс Beach должен содержать три поля: String name, float distance, int quality.
2. Класс Beach должен реализовывать интерфейс Comparable.
3. Метод compareTo класса Beach как минимум должен учитывать качество пляжа и дистанцию.
4. Все методы класса Beach, кроме метода main, должны быть синхронизированы.
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }
/*
* Почему же, вполне все логично: если дистанция до пляжа и его качество у обоих пляжей совпадают, то возвращаем 0.
* Иначе вычисляем "вес" каждого пляжа как (качество - дистанция) и возвращаем полученную разницу, которая показывает
* насколько первый пляж лучше (положительное число) или хуже (отрицательное число) второго пляжа.*/
    @Override
    public synchronized int compareTo(Beach o) {
        float comparedDistance = o.distance - this.distance;
        int comparedQuality = o.quality - this.quality;
        if (comparedDistance==0 && comparedQuality ==0) return 0;
        else{
            return (this.quality-(int)this.distance) - (o.quality-(int)o.distance);
        }
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }
}
