package com.xworkz.usageofclasses;

import com.xworkz.usageofclasses.gun.*;

public class Runner {

    public static void main(String[] args) {

        //using class as local variable
        SoldierLocal soldierLocal = new SoldierLocal();
        soldierLocal.local();
        System.out.println("==========================");


        //using class Gun as  parameter
        Gun gun = new Gun();
        gun.fire();
        gun.display();
        PoliceParam policeParam = new PoliceParam();
        policeParam.reload(gun);

        // using class Gun as INSTANCE VARIABLE
        System.out.println("==========================");
        Dboss dboss = new Dboss();
        dboss.buy();

        System.out.println("+++++++++++++++++++++++++++++");
        Godsereturn godsereturn = new Godsereturn();
        godsereturn.gandhiji();


    }
}
