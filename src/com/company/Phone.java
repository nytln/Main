package com.company;

public class Phone {
    public static void main(String[] args){
        PhoneParameters Iphone = new PhoneParameters();
        System.out.println(Iphone.IntelCore.core);
        Iphone.IntelCore.working();
        Iphone.RAM.working();
        Iphone.CAM.working();

    }
}
