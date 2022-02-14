package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
//        int num1, num2, result;
//        num1 = 5;
//        num2 = 10;
//          result = num1 + num2;
//        System.out.print("result is " + result);
//
//
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Please enter first number: ");
//        num1 = scn.nextInt();
//        System.out.print("Please enter second number ");
//        num2 = scn.nextInt();
//        result = num1 + num2;
//        result++;
//        System.out.print("Result is " + result);

        float  num1, num2, result;


        Scanner scn = new Scanner(System.in);
        System.out.print("Print enter first number: ");
        num1 = scn.nextFloat();
        System.out.print("Please enter second number: ");
        num2 = scn.nextFloat();
        result = num1 + num2;
        System.out.print("Result is: " + result);



    }
}
