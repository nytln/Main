package com.company;

public class Main18 {
    public static void main(String[] args){
        int sum = 0;
        int [] array = new int[] {10,40,30,50,10,40,5,15,2,5,6,7,423,5365,45,3532,42,4,2345,34,5};
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        if(i >= array.length-3) {
            sum = sum + array[i];
        }
        }
        System.out.println("sum is " + sum);
    }
}