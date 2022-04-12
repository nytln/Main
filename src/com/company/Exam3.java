package com.company;
// <50 = false; >50 = true;
public class Exam3 {
    public static void main(String[] args){
        double n = Math.random();
        System.out.println(function(n));
    }
    public static boolean function(double n){
        if(n <= 0.5){
            return false;
        }else{
            return true;
        }
    }
}

