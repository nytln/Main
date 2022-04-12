package com.company;

public class Exam1 {
    public static void main(String[] args){
        Exam1class car1 = new Exam1class();
        Exam1class car2 = new Exam1class("BMW", "777");
        Exam1class3 car3 = new Exam1class3("AUDI", "A6", "333", "petrol");
        System.out.println(car2.mark);
        System.out.println(car1.model);
        System.out.println(car2.number);
        Exam1class2 car4 = new Exam1class2();
        Exam1class2 car5 = new Exam1class2("Ford", 4, 55000);

        Exam1class2 car6 = new Exam1class2("Porsche", "911", "888", "auto", 3, 100000);
        System.out.println(car4.system);

        System.out.println(car3.mark);
        System.out.println(car3.model);
        System.out.println(car3.number);
        System.out.println(car3.fuel);

        System.out.println(car5.engine);
        System.out.println(car6.mark);
        System.out.println(car6.model);
        System.out.println(car6.number);
        System.out.println(car6.system2);
        System.out.println(car6.engine);
        System.out.println(car6.price);
    }
}