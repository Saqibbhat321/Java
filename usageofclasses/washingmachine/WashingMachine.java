package com.xworkz.usageofclasses.washingmachine;

public class WashingMachine {


    public String brand="TIn tong";
    public String type="chinese";
    public double capacity=50;


//    public WashingMachine()
//    {
//        System.out.println("no-arg constructor in washingmachine");
//    }

    public void rinse()
    {
        System.out.println("Rinsing the clothes in washingmachine");
    }
    public void show()
    {
        System.out.println("Brand of WM: "+brand);
        System.out.println("Type of WM: "+type);
        System.out.println("Capacity of WM: "+capacity);
        rinse();
    }
}
