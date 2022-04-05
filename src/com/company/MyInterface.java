package com.company;

public class MyInterface implements Print, Read{
    public String model;
    public String mark;

    MyInterface(String mark, String model){
        this.mark = mark;
        this.model = model;
    }
    public void printcar(){
        System.out.println(mark + " " + model);
    }
    public void readcar(){
        System.out.println("Audi A6");
    }
}
