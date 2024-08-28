package com.xworkz.inheritance.objects;

public class BadamHalwa extends Halwa{


    public BadamHalwa()
    {
        //super();    implicitly called by compiler no need to write for no-arg constructor
        System.out.println("Badamhalwa no-arg const... in BadamHalwa(child) class");
    }

    public void badamTaste()
    {
        System.out.println("Tasting halwa in BadamHalwa(child) class");
    }
}
