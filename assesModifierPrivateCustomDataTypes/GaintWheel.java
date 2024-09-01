package com.xworkz.assesModifierPrivateCustomDataTypes;

public class GaintWheel {

    private String size;
    private String color;
    private double cost;

    public GaintWheel()
    {
        System.out.println("this is a no argument costructor");
    }


    public GaintWheel(String size,String color,double cost)
    {
        this.color = color;
        this.size = size;
        this.cost = cost;
    }

    public void wheelDetails()
    {
        System.out.println("color of wheel "+this.color);
        System.out.println("size of wheel "+this.size);
        System.out.println("cost of wheel "+this.cost);
    }
}
