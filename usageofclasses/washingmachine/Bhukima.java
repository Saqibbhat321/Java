package com.xworkz.usageofclasses.washingmachine;

public class Bhukima {


    // using class Washing Machine as return type

    public WashingMachine clip()
    {
        System.out.println("Bhumika Start");
        WashingMachine wash = new WashingMachine();
        wash.brand= "Panasonic";
        wash.type="1 door";
        wash.capacity = 10;
        wash.show();
        System.out.println("Bhumika Stop");
        return wash;
    }
}
