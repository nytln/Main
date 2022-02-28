package com.company;

public class Main25 {
    public static void main(String[] args){

        int sum = 0;
        int[] array = new int[]{10, 40, 30, 50, 10, 40, 5, 15, 2, 5, 6, 7, 423, 5365, 45, 3532, 42, 4, 2345, 34, 5};
        int i = 0;
        while(i < array.length) {
            sum = sum + array[i];
            i++;
            }
        System.out.println("sum is " + sum);

    }
}



