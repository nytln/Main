package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){

        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your age:");
        num = scn.nextInt();

         if (num >= 64) {
            System.out.println("Congratulations, you have unlocked wasted life achievement");

         }else if (num < 64 && num <39){
             System.out.println("Idi rabotay suka");

         }if (num < 64){
            int dif = 64 - num;
            System.out.println("You need to rabotat "+dif+" years for pension");
        }
    }
}
