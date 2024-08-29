package com.xworkz.pizza.pizza;

public class Tomstatic {


    public static Pizza pizza = new Pizza();


    public Tomstatic()
    {
        System.out.println("Static way");
    }
    public void drop()
    {
        if(pizza!=null)
        {
            System.out.println(pizza.name);
            System.out.println(pizza.cost);
            pizza.satisfyCraving();
        }
    }
}

