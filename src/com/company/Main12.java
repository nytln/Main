package com.company;

public class Main12 {
    public static void main(String[] args){
        for(int i = 1; i < 101; i+=2) {
            System.out.print(" " + i);
            if (i == 99){
                System.out.println();
            }
        }
        for(int i = 2; i < 100; i+=2) {
            System.out.print(" " + i);
        }
    }
}
