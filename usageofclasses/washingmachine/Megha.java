package com.xworkz.usageofclasses.washingmachine;

public class Megha {


    //using class Washing Machine as LOCAL VARIABLE

    public void washmegha()
    {

        System.out.println("megha ji start");
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.type="2 door";
        washingMachine.capacity= 25.5;
        washingMachine.brand = "LG";
        washingMachine.show();
        System.out.println("megha ji stop");
    }
}
