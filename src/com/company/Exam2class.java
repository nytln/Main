package com.company;

public class Exam2class implements Exam2int{
    public String country;

    Exam2class(String country){
        this.country = country;
    }
    public void printcountry(){
        System.out.println("Country is " + country);
    }
}