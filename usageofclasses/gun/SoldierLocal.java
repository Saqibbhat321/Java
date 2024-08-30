package com.xworkz.usageofclasses.gun;

public class SoldierLocal {


    public void local()
    {
        System.out.println("start local in Soldierlocal");
        Gun gun=new Gun();
        gun.fire();
        gun.display();
        System.out.println("End local in Soldierlocal");
    }
}
