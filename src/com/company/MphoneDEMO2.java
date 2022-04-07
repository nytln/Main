package com.company;

public class MphoneDEMO2 extends MphoneDEMO{
    String system = "Windows";
    String system2;
    int core;
    int price;

    MphoneDEMO2(){

    }
    MphoneDEMO2(String sysetm2, int core, int price){
        this.system2 = system2;
        this.core = core;
        this.price = price;
    }
    MphoneDEMO2(String mark, String model, String number, String system2, int core, int price){
        super.mark = mark;
        super.model = model;
        super.number = number;
        this.system2 = system2;
        this.core = core;
        this.price = price;
    }
}
