package com.company;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args){

        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        switch(n){
            case 5:
                System.out.println("number is 5");
                break;
            case 10:
                System.out.println("number is 10");
                break;
            default:
                System.out.println("number is some number");
        }
    }
}
