package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main24game {
    public static void main(String[] args){
        int num1, num2, result;
        boolean isTrue = true;
        num1 = (int) Math.round(Math.random() * 100);
        Scanner scn = new Scanner(System.in);
        System.out.println("This is a game");
        System.out.println("Rules: First number is a secret. Sum of two numbers must be lower than 100");
        System.out.println("First number is a secret, please enter a second number: ");
        num2 = scn.nextInt();
        while(isTrue) {
            if (num2 <= 10) {
                System.out.println("Second number MUST be bigger than 10");
                System.out.println("Please enter a second number again: ");
                num2 = scn.nextInt();
            } else {
                result = num1 + num2;
                if (result < 100) {
                    System.out.println("You have won the game!, sum of two numbers was: " + result);
                    System.out.println("Secret number was: " + num1);
                } else {
                    System.out.println("You lost the game. Sum of 2 numbers were bigger than 100");
                    System.out.println("Secret number was: " + num1);
                }
                isTrue = false;
            }
        }
    }
}
