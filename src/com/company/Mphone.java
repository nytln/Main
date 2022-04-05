package com.company;

public class Mphone {
    public static void main(String[] args){
        MphoneDEMO phone1 = new MphoneDEMO();
        MphoneDEMO phone2 = new MphoneDEMO("Samsung", "+327 54358435");
        MphoneDEMO phone3 = new MphoneDEMO("Nokia", "M15", "+372 50394283");
        System.out.println(phone1.model);
    }
}
