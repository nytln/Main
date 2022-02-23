package com.company;

public class Main21 {
    public static void main(String [] args){
        boolean isTrue = true;
        int i = 0;
        int num = 0;
        int num2 = 0;
        while(i < 10){
            i++;
            System.out.println("Hello");
        }
        while(isTrue){
            num++;
            System.out.println("Hello");
            if(num > 10){
                isTrue = false;
            }
        }
        while (num2 < 100){
            num2+= 5;
            System.out.print(" " + num2);
        }
    }
}
