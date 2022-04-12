package com.company;

public class Exam1class2 extends Exam1class{
    String system = "auto";
    String system2;
    int engine;
    int price;

    Exam1class2(){

    }
    Exam1class2(String system2, int engine, int price){
        this.system2 = system2;
        this.engine = engine;
        this.price = price;
    }
    Exam1class2(String mark, String model, String number, String system2, int engine, int price){
        super.mark = mark;
        super.model = model;
        super.number = number;
        this.system2 = system2;
        this.engine = engine;
        this.price = price;
    }
}