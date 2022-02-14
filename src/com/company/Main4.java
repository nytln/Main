package com.company;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter any number:");
        n = scn.nextInt();
        if (n < 0) {
            System.out.println("Number is negative");
        } else if (n <= 100) {
            System.out.println("Number is positive");
        } else if (n > 100) {
            System.out.println("Number is out of the limit");
        } else{
            System.out.println("Number is 0");
        }

    }
}