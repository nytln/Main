package com.company;

import java.util.Arrays;

public class Main16 {
    public static void main(String[] args){

        int[] array = new int[]{1,3,5,7,9,7,6,4,3,6,5};
        int number = 3;
        for(int i = 0; i < array.length; i++) {
            if (number == array[i]){
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
