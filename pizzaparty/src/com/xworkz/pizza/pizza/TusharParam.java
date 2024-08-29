package com.xworkz.pizza.pizza;

public class TusharParam {


    public TusharParam()
    {
        System.out.println("parametric way");
    }
    public void deliver(Pizza pizza)
    {

        System.out.println(pizza.name);
        System.out.println(pizza.cost);

    }
}
