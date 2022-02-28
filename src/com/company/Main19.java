package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main19 {
    public static void main(String[] args){

        while(true) {
            String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                                "September", "October", "November", "December"};
            int n;
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter a number of a month: ");
            n = scn.nextInt();
            for (int i = 0; i < months.length; i++) {
                if (n == i) {
                    System.out.println(months[i-1]);
                }
            }
        }
    }
}
