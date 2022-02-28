package com.company;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args){

            boolean isTrue = true;
            float num1, num2, result;
            char operation;
            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter first number:");
            num1 = scn.nextFloat();
            System.out.println("Please enter second number");
            num2 = scn.nextFloat();
                System.out.println("Please enter an operation(+, -, *, /)");
                operation = scn.next().charAt(0);
                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        System.out.print("Result is " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.print("Result is " + result);
                        break;
                    case '/':
                        result = num1 / num2;
                        System.out.print("Result is " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.print("Result is " + result);
                        break;
                    default: while(isTrue) {
                        System.out.println("Error! Incorrect symbol! Try again : ");
                        operation = scn.next().charAt(0);
                        switch (operation) {
                            case '+' -> {
                                result = num1 + num2;
                                isTrue = false;
                                System.out.print("Result is " + result);
                            }
                            case '-' -> {
                                result = num1 - num2;
                                isTrue = false;
                                System.out.print("Result is " + result);
                            }
                            case '/' -> {
                                result = num1 / num2;
                                isTrue = false;
                                System.out.print("Result is " + result);
                            }
                            case '*' -> {
                                result = num1 * num2;
                                isTrue = false;
                                System.out.print("Result is " + result);
                            }
                        }
            }
        }
    }
}
