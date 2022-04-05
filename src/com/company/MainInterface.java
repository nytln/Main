package com.company;

public class MainInterface {
    public static void main(String[] args){
        MyInterface car = new MyInterface("BMW" , "GT");
        car.printcar();
        car.readcar();
    }
}
