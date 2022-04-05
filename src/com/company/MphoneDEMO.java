package com.company;

public class MphoneDEMO {
    String mark;
    String model;
    String number;

    MphoneDEMO(){
        mark = "Iphone";
        model = "XR";
        number = "1220";
    }

    MphoneDEMO(String mark1, String number1){
        mark = mark1;
        number = number1;
    }
    MphoneDEMO(String mark, String model, String number){
        this.mark = mark;
        this.model = model;
        this.number = number;
    }
}
