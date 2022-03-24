package com.company;

import java.util.Arrays;

public class Main41 {
    public static void main(String[] args){
        int length = 1000;
        int[] prostye = new int[length];
        int n = 0;
        for(int i = 2; n < length; i++){
            boolean isTrue = true;
            for(int j = 2; j < i; j++){
            if(i%j == 0) {
                isTrue = false;
                }
            }
            if(isTrue){
                prostye[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(prostye));
    }
}
