package com.company;

public class Main33 {
    public static void main(String[] args){
        int [] arr = {5, 6, 7, 8};
        try{
//            int num1;
//            num1 = 100/0;
            System.out.println(arr[2]);
        }catch (Exception e){
            System.out.println("Some error" + e);
        }finally{
            System.out.println("hi");
        }
    }
}
