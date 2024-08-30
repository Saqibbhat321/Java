package com.xworkz.usageofclasses.gun;

public class Dboss {


    public Gun gun=new Gun();; // USING GUN CLASS AS INSTANCE VARIABLE

    public void buy()
    {
        System.out.println("start  buy in Dboss ");

        if(gun!=null)
        {
        gun.fire();
        gun.display();
        }
        else {
            System.out.println("Gun is Null");
        }
        System.out.println("End  buy in Dboss ");
    }
}
