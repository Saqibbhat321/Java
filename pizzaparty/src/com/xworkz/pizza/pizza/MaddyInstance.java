package com.xworkz.pizza.pizza;

public class MaddyInstance {


    public Pizza pizza = new Pizza();
public MaddyInstance()
{
    System.out.println("instance way");
}

    public void eating()
    {
        Pizza ref = pizza;
        if(ref!=null)
        {
            System.out.println(ref.name);
            System.out.println(ref.cost);
            ref.satisfyCraving();
        }
        else
        {
            System.out.println("Pizza is pointing to null");
        }
    }
}
