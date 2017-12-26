package com.javarush.task.task16.task1632;

public class ThirdThread extends Thread {
    public void run() {
        try{
            while (true){
                System.out.println("Ура");
                Thread.sleep(500);
            }
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }
}
