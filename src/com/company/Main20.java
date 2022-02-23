package com.company;

public class Main20 {
    public static void main(String[] args){

        int  num1, num2, num3;
        num1 = 0;
        num2 = 1;
        for(int i = 0; i < 20; i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
                System.out.print(" " + num3);
        }
    }
}
