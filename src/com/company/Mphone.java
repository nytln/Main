package com.company;

public class Mphone {
    public static void main(String[] args){
        MphoneDEMO phone1 = new MphoneDEMO();
        MphoneDEMO phone2 = new MphoneDEMO("Samsung", "+327 54358435");
        MphoneDEMO phone3 = new MphoneDEMO("Nokia", "M15", "+372 50394283");
        System.out.println(phone1.model);
        MphoneDEMO2 phone4 = new MphoneDEMO2();
        MphoneDEMO2 phone5 = new MphoneDEMO2("Ubuntu", 4, 1000);

        MphoneDEMO2 phone6 = new MphoneDEMO2("Apple", "12", "+372 59340853", "Windows", 6, 1000);
        System.out.println(phone4.system);

        System.out.println(phone5.core);

        System.out.println(phone6.mark);
        System.out.println(phone6.model);
        System.out.println(phone6.number);
        System.out.println(phone6.system2);
        System.out.println(phone6.core);
        System.out.println(phone6.price);
    }
}
