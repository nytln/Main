package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main32 {
    public static void main(String[] args){
        System.out.println("Please write a word or a sentence: ");
        Scanner scn = new Scanner(System.in);
        String someString = scn.nextLine();
        System.out.println("Please write a letter you want to detect in a text: ");
        char someChar = scn.next().charAt(0);
        int count = 0;
        int total = 0;
        int words = 0;
        String[] totalwords = someString.split(" ");
        System.out.println(Arrays.toString(totalwords));

        for(int i = 0; i < someString.length(); i++){
            if(someString.charAt(i) == someChar){
                count++;
            }
            if(someString.charAt(i) != ' '){
                total++;
            }
        }
        for(String element : totalwords){
            words++;
        }
        System.out.println("Special letter count: " + count);
        System.out.println("All letter count: " + total);
        System.out.println("All words in a sentence: " + words);
    }
}
