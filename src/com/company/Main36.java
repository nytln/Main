package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main36 {
    public static void main(String[] args){

        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter name of a month: ");
        String monthnames = scn.nextLine();

        if(Arrays.asList(months).contains(monthnames)){
            System.out.println(Arrays.asList(months).indexOf(monthnames) + 1);

        }else{
            System.out.println("Error!");
        }
    }
}
