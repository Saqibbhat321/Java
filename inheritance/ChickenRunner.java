package com.xworkz.inheritance;

import com.xworkz.inheritance.objects.Chicken;
import com.xworkz.inheritance.objects.LeghornChicken;

public class ChickenRunner {

    public static void main(String[] args) {


        Chicken chicken = new Chicken();

        chicken.lifeSpan=2;
        chicken.purpose= "Lay eggs";
        chicken.size= "Small";
        chicken.weight=3.5;
        chicken.eat();
        chicken.layEggs();
        chicken.kukuku();
        chicken.noddingHead();
        System.out.println("lifespan (years): "+chicken.lifeSpan);
        System.out.println("purpuse of chicken: "+chicken.purpose);
        System.out.println("size of chicken: "+chicken.size);
        System.out.println("weight of chicken in kg's: "+chicken.weight);
        System.out.println("====================================================");

        Chicken chicken1 = new LeghornChicken();
        chicken1.weight=5.2;
        chicken1.size="big";
        chicken1.purpose="meat";
        chicken1.lifeSpan= 1;
        chicken1.kukuku();
        chicken1.noddingHead();
        chicken1.layEggs();
        chicken1.eat();
        System.out.println("life span is : "+chicken1.lifeSpan);
        System.out.println("purpose : "+chicken1.purpose);
        System.out.println("size: "+chicken1.size);
        System.out.println("weight: "+chicken1.weight);

        System.out.println("+++++++++++++++++++++++++++++++++");

        LeghornChicken leghornChicken = new LeghornChicken();
        leghornChicken.dancing();
    }
}
