package com.xworkz.inheritance;

import com.xworkz.inheritance.objects.Bull;
import com.xworkz.inheritance.objects.DairyBulls;

public class BullRunner {

    public static void main(String[] args) {


        Bull bull = new Bull();
        bull.color= "black";
        bull.hasHorns = true;
        bull.favoriteFood="beans";
        bull.cost= 30000;
        bull.isDangerous= true;
        bull.size= "Big";
        bull.eat();
        bull.run();
        bull.sleep();
        System.out.println(bull.color);
        System.out.println("has horns :"+bull.hasHorns);
        System.out.println(bull.favoriteFood);
        System.out.println(bull.cost);
        System.out.println(bull.size);
        System.out.println("--------------------------------------------------------");
        Bull dairyBulls = new DairyBulls();
        dairyBulls.cost=399999;
        dairyBulls.hasHorns= false;
        dairyBulls.favoriteFood = "Green grass";
        dairyBulls.size= "Medium";
        dairyBulls.isDangerous= false;
        dairyBulls.color= "white";
        System.out.println("cost: "+dairyBulls.cost);
        System.out.println("has horns: "+dairyBulls.hasHorns);
        System.out.println("favroute food: "+dairyBulls.favoriteFood);
        System.out.println("is dangerous: "+dairyBulls.isDangerous);
        System.out.println("size: "+dairyBulls.size);

        dairyBulls.eat();
        dairyBulls.run();
        dairyBulls.sleep();
        DairyBulls dairyBulls1 = new DairyBulls();
        dairyBulls1.milking();
    }
}
