package com.company;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args){


        while(true) {
            String auto;
            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter a mark of a car");
            auto = scn.nextLine();
            switch (auto) {
                case "bmw":
                    System.out.println("Ohuenna bystra mashina brat dal dal ushel");
                    break;
                case "audi":
                    System.out.println("Prohodimost ebal quattro vse dela");
                    break;
                case "Mercedes":
                    System.out.println("Ohuet komfort minet v mesedese ohuet");
                    break;

                default:
                    System.out.println("ty che ebanulsya staryi?");
            }
        }
    }
}
