package com.xworkz.usageofclasses;

import com.xworkz.usageofclasses.washingmachine.*;

public class WashingMachineRunner {


    public static void main(String[] args) {

        Megha megha = new Megha();
        megha.washmegha(); //Local variable washing machine

        System.out.println("----------------------------------------------");
        Lakshmi lakshmi = new Lakshmi();
        WashingMachine washingMachine= new WashingMachine();
        lakshmi.DryClothes(washingMachine); //washing machine class as Parameter
//        new WashingMachine().rinse();
//        new WashingMachine().show();


        // using class Washing Machine as return type
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Bhukima bhukima = new Bhukima();
        bhukima.clip();


        System.out.println("##################################");
        Abhshek abhshek = new Abhshek();
        if(abhshek!= null)
        {
            abhshek.plugging();
        }
        else System.out.println("nullll");
    }
}
