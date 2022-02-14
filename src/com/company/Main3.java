package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int first;
        System.out.print("Enter first number: ");
        first = num.nextInt();

        if(first > 0){
            System.out.print("Number is positive");
        }else if(first <0){
            System.out.print("Number is negative");
        }else{
            System.out.print("Number is 0");
        }
    }
}
