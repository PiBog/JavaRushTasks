package com.javarush.task.task14.task1408;


 class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 300;
    }
    String getDescription (){
        return (super.getDescription()+" Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
