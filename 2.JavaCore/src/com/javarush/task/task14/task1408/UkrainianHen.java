package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 400;
    }
    String getDescription (){
        return (super.getDescription()+" Моя страна - " + Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
