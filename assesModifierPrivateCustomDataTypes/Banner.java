package com.xworkz.assesModifierPrivateCustomDataTypes;

import java.util.PrimitiveIterator;

public class Banner {

    private String size;
    private String material;
    private double cost;

    public Banner()
    {
        System.out.println("This is a no argument constructor");
    }

    public Banner(String size,String material,double cost)
    {
        this.cost=cost;
        this.material = material;
        this.size = size;
    }

    public void bannerDetails()
    {
        System.out.println("Size of banner is: "+this.size);
        System.out.println("Cost of banner is: "+this.cost);
        System.out.println("Material of banner is: "+this.material);
    }
}
