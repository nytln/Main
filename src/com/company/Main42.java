package com.company;

import java.util.Arrays;

public class Main42 {
    public static void main(String[] args){
        int length = 100;
        int[] simplen = new int[length];
        int n = 0;
        for(int i = 2; n < simplen.length; i++){
            if(checkSimplen(i)){
                simplen[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(simplen));
    }
    public static boolean checkSimplen(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
