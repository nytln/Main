package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args){

        String answer;
        int num1, num2, result;
        boolean isTrue2 = true;
        boolean isTrue3;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.println("This is a game");
        System.out.println("Rules: First number is a secret. Sum of two numbers must be lower than 100");
        while(isTrue2){
            isTrue3 = true;
            boolean isTrue = true;
            num1 = (int) Math.round(Math.random() * 100);
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
            System.out.println("Try again? (Yes/No)");
            answer = scn2.nextLine();
            while(isTrue3){
                switch (answer) {
                    case "No":
                    case "no":
                        isTrue2 = false;
                        isTrue3 = false;
                        break;

                    case "Yes":
                    case "yes":
                        isTrue2 = true;
                        isTrue3 = false;
                        break;

                    default:
                        System.out.println("Error! Incorrect symbol! Yes/No (only)");
                        answer = scn2.nextLine();

                }
            }
        }
    }
}