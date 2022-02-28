package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main27 {
    public static void main(String[] args){
        int sum = 0;
        int[] array = new int[]{10, 40, 30, 50, 10, 40, 5, 15, 2, 5, 6, 7, 423};
        int i = 0;
        boolean isTrue = true;
            while(isTrue) {
                sum += array[i];
                i++;
                if (i > array.length) {
                    isTrue = false;
            }
        }
        while(i < array.length){
            sum = sum + array[i];
            i++;
        }
        for(int j = 0; j < array.length; j++){
            sum += array[i];
        }
        for(int element : array){
            System.out.println(element);
            sum = sum + element;
        }
        IntStream elements = IntStream.of(array);
        sum = elements.sum();
        System.out.println(sum);

        System.out.println(Arrays.stream(array).sum());
    }
}
