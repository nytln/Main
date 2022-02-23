package com.company;

public class Main22 {
    public static void main(String[] args){
        int num = 3;
        int result = 1;
        int range = 1;

        while(true){
            result = result * num;
            System.out.println(num + " to the extent " + range + " = " + result);
            range++;
            if(range > 5){
                break;
            }
        }
    }
}
