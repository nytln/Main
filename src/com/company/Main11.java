package com.company;

public class Main11 {
    public static void main(String[] args){

        int num = 2;
        for(int i = 1; i < 11; i++){
            if(num != 128){
                System.out.println(num);
            }
            num = num * 2;
        }
    }
}
