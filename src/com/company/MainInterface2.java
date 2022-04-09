package com.company;

public class MainInterface2 {
    public static void main(String[] args){
        Array2 a = new MyArray2();
        System.out.println(a.Add(5));
        System.out.println(a.Add(10));
        System.out.println(a.Add(20));
        System.out.println(a.Add(30));

        System.out.println(a.Get(1));

        Array2 A1 = new MyArray2();
        System.out.println(A1.Add("Kolyan"));
        System.out.println(A1.Add("Dimas"));
        System.out.println(A1.Add("Leha"));
        System.out.println(A1.Add("Artur"));
        A1.GetClassNames();
    }
}
