package com.company;

import java.util.ArrayList;

public class Main34 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Lexus");
//        System.out.println(cars);
        System.out.println(cars.get(1));
        cars.set(0, "Volvo");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.remove(2);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

    }
}
