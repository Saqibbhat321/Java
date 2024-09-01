package com.xworkz.assesModifierPrivateCustomDataTypes;

public class Garland {

    private String flowerName;
    private double weight;
    private String size;


    public Garland()
    {
        System.out.println("This is a no argument Constructor");
    }

    public Garland(String flowerName,double weight, String size)
    {
        this.flowerName = flowerName;
        this.weight = weight;
        this.size = size;
    }

    public void garlandDetails()
    {
        System.out.println("flower used: "+this.flowerName);
        System.out.println("weight of garland: "+this.weight);
        System.out.println("size of garland: "+this.size);
    }
}
