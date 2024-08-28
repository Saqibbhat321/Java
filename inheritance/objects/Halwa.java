package com.xworkz.inheritance.objects;

public class Halwa {

    public String taste;
    public double startingCost;

    public Halwa()
    {
        System.out.println("Halwa no-arg const... in Parent Class");
    }

    public void eat()
    {
        System.out.println("Eating halwa in halwa(parent) class");
    }
    public void material()
    {
        System.out.println("primary material for halwa is suji");
    }
}
