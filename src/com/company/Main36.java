package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main36 {
    public static void main(String[] args){

        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        String[] months2 = new String[]{"january", "february", "march", "april", "may", "june", "july", "august",
                "september", "october", "november", "december"};

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter name of a month: ");
        String monthnames = scn.nextLine();

//        for(int i = 0; i < months.length; i++) {
//            months[i] = Character.toLowerCase(months[i].charAt(0)) + months[i].substring(1);
//        }
//            System.out.println(Arrays.toString(months));

        if(Arrays.asList(months).contains(monthnames)){
            System.out.println(Arrays.asList(months).indexOf(monthnames) + 1);
        }
        else if(Arrays.asList(months2).contains(monthnames)){
            System.out.println(Arrays.asList(months2).indexOf(monthnames) + 1);
        }else{
            System.out.println("Error!");
        }
    }
}
