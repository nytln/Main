package com.company;

import java.util.Arrays;

public class Main13 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
            System.out.println(array[5]);
        int[] array2 = new int[]{1,2,3,4};
            System.out.println(array2[3]);
        int[] array3 = new int[]{5,6,7,8,9};
            System.out.println(Arrays.toString(array3));

//            2 dimensional array

        int[][] array4 = new int[][]{{1,2,3,4,5}, {6,7,8,9}, {10,12,14}};
            System.out.println(array4[1][2]);

//            1 dimensional array with float

        float[] array5 = new float []{1.1f,2.6f,3.7f,4.8f};
            System.out.println(Arrays.toString(array5));

        int[] array6 = new int[5];
        array6[0] = 5;
        array6[4] = 10;
            System.out.println(Arrays.toString(array6));

        String [] cars = new String[3];
        cars[0] = "AUDI";
        cars[1] = "BMW";
        cars[2] = "MERCEDES";
            System.out.println(Arrays.toString(cars));

    }
}
