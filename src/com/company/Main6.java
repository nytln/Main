package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){

        float num1, num2, result;
        char operation;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter first number:");
        num1 = scn.nextFloat();
        System.out.println("Please enter second number");
        num2 = scn.nextFloat();
        System.out.println("Please enter an operation(+, -, *, /)");
        operation = scn.next().charAt(0);

        switch(operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;

            default:
                System.out.println("Error");
                return;
        }

        System.out.print("Result is " + result);

    }
}
