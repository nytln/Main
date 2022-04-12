package com.company;

public class Exam1class {
    String mark;
    String model;
    String number;

    Exam1class(){
        mark = "BMW";
        model = "550";
        number = "777";
    }

    Exam1class(String mark1, String number1){
        mark = mark1;
        number = number1;
    }
    Exam1class(String mark, String model, String number){
        this.mark = mark;
        this.model = model;
        this.number = number;
    }
}
