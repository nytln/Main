package com.company;

import java.util.Arrays;

public class Main15 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,4324,234,23,423,4,23,4,23,4,25,56,586,3,645,23};
        int result = array[0] + array[1] + array[2] + array[3];
        System.out.println(result);
        System.out.println(array.length);
        int sum = 0;
        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
            sum = sum + array[i];
        }
        System.out.print("sum is " + sum);
    }
}
