package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class reader {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write a letter you want to detect in a text: ");
        char someChar = scn.next().charAt(0);
        char someChar2 = Character.toUpperCase(someChar);
        int lettersum = 0;
        BufferedReader file = null;
        try{
            file = new BufferedReader(new FileReader("src/com/Kolyan.txt"));
            String line;
            while((line = file.readLine()) != null){
                int lettercount = 0;
                String[] parts = line.split(" ");
//                System.out.println(parts.length);
//                System.out.println(Arrays.toString(parts));

                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == someChar || line.charAt(i) == someChar2){
                        lettersum++;
                        lettercount++;
                    }
                }
                for(int i = 0; i < parts.length; i++){
                    parts[i] = Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1);
                }
                System.out.println(Arrays.toString(parts));
                System.out.println("Special letter count: " + lettercount);
            }

        }catch (Exception e){
            System.out.println("Error" + e);
        }
        System.out.println("Special letter sum is : " + lettersum);
    }
}
