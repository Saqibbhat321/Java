package com.xworkz.usageofclasses.washingmachine;

public class Lakshmi {


    //initializing Class Washing Machine as Parameter

    public void DryClothes(WashingMachine washingMachine)
    {
        System.out.println("Lakshmi start");
        washingMachine.brand="Samsung";
        washingMachine.type ="3 door";
        washingMachine.capacity= 30.5;
        washingMachine.show();
        washingMachine.rinse();
        System.out.println("Lakshmi stop");
    }
}
