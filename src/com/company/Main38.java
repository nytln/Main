package com.company;

public class Main38 {
    public static void main(String[] args){
        System.out.println(function(10, 5));
        int num1, num2;
        num1 = 100;
        num2 = 200;
        System.out.println(function2(num1, num2));
        function3();
    }
    public static int function(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }
    public static int function2(int number1, int number2){
        int result;
        result = number2 - number1;
        return result;
    }
    public static void function3() {
        int num1, num2;
        int result;
        num1 = 20;
        num2 = 30;
        result = num1 + num2;
        System.out.println(result);
    }
}
