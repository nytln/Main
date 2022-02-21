package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args){
        int []array;
        int n;
        int []array2;
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a length of an array: ");
        n = scn.nextInt();
        array = new int [n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter an array[" + i + "] = ");
            array[i] = scn.nextInt();
        if(array[i] > 50){
            count++;
           }
        }
        System.out.println(Arrays.toString(array));
        array2 = new int[count];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 50){
            array2[index] = array[i];
            index++;
            }
        }
        System.out.println(Arrays.toString(array2));
   }
}

