package com.company;

public class Main43{
    public static void main(String[] args) {
        PersonDemo person = new PersonDemo();
        PersonDemo person2 = new PersonDemo();
        System.out.println(person.age);
        System.out.println(person.height);
        System.out.println(person.name);

        person2.age = 24;
        System.out.println(person2.age);
        person.say("Artur");

    }
}
