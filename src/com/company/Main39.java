package com.company;

public class Main39 {
    public static void main(String[] args){
        int [] numbers = new int[]{34, 432, 432, 5342, 45, 2345, 354, 423, 467, 67, 423, 8756, 5423};

        int max, min;
        max = min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
    }
}
