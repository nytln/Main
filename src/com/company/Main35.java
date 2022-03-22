package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main35 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(9);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Porsche");
        cars.add("Toyota");
        cars.add("Mazda");
        Collections.sort(cars);
        System.out.println(cars);
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
