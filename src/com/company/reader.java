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
        int lettersum = 0;
        BufferedReader file = null;
        try{
            file = new BufferedReader(new FileReader("src/com/Kolyan.txt"));
            String line;
            while((line = file.readLine()) != null){
                int lettercount = 0;
                String[] parts = line.split(" ");
                System.out.println(line);
                System.out.println(Arrays.toString(parts));
                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == someChar){
                        lettersum++;
                        lettercount++;
                    }
                }
                System.out.println("Special letter count: " + lettercount);
            }

        }catch (Exception e){
            System.out.println("Error" + e);
        }
        System.out.println("Special letter sum is : " + lettersum);
    }
}
