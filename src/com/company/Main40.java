package com.company;

public class Main40 {
    public static void main(String[] args) {
        int[] numbers = new int[]{34, 432, 432, 5342, 45, 2345, 354, 1, 423, 467, 67, 423, 8756, 5423};
        System.out.println(getMaxValue(numbers));
        System.out.println(getMinValue(numbers));
    }

    public static int getMaxValue(int[] num1) {
        int max;
        max = num1[0];
        for (int i = 0; i < num1.length; i++) {
            if (max < num1[i]) {
                max = num1[i];
            }
        }
        return max;
    }
    public static int getMinValue(int[] num2) {
        int min;
        min = num2[0];
        for (int i = 0; i < num2.length; i++) {
            if (min > num2[i]){
                min = num2[i];
            }
        }
        return min;
    }
}
