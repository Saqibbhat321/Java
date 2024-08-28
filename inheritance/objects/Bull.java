package com.xworkz.inheritance.objects;

public class Bull {

    public String size;
    public int cost;
    public String color;
    public boolean isDangerous;
    public boolean hasHorns;
    public String favoriteFood;

    public Bull()
    {
        System.out.println("no-arg const in parent class Bull");
    }
    public void run()
    {
        System.out.println("Bull running in parent class");
    }
    public void eat()
    {
        System.out.println("bull eating in parent class");
    }
    public void sleep()
    {
        System.out.println("bulling sleeping in parent class");
    }
}
