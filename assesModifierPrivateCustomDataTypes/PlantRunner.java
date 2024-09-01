package com.xworkz.assesModifierPrivateCustomDataTypes;

public class PlantRunner {

    public static void main(String[] args) {


        Plant plant1 = new Plant("Herbs",false,"mazda",0,"summer");
        Plant plant2 = new Plant("Shrubs",true,"lomlan",10,"summer");
        Plant plant3 = new Plant("Cactus",false,"cactus",49,"Hot weather");
        plant1.setCostOfPlant(599);
        plant1.setAvailable(true);
        plant1.setHeight(50);
        plant1.setColorOfFlower("purple");
        plant1.setSize("Small");
        plant2.setSize("Large");
        plant2.setCostOfPlant(999);
        plant2.setAvailable(false);
        plant2.setColorOfFlower("White");
        plant2.setHeight(900);
        plant3.setSize("Medium");
        plant3.setCostOfPlant(1200);
        plant3.setAvailable(true);
        plant3.setColorOfFlower("Red");
        plant3.setHeight(543);

        Plant[] plants = new Plant[3];
        plants[0]=plant1;
        plants[1]=plant2;
        plants[2]=plant3;
        for(int i = 0; i<plants.length;i++)
        {
            Plant plantref = plants[i];
            System.out.println("=====================================");
            plantref.details();
        }
    }
}
