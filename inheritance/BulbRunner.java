package com.xworkz.inheritance;

import com.xworkz.inheritance.objects.Bulb;
import com.xworkz.inheritance.objects.HavellsBulb;

public class BulbRunner {

    public static void main(String[] args) {


        //init and calling/invoking parent class iv and methods resp...
        HavellsBulb havells = new HavellsBulb();
        havells.bulbcolor="Red";
        System.out.println("color of bulb is: "+havells.bulbcolor);
        havells.bulbOn();
        havells.lighting();

        System.out.println("++++++++++++++++++++++++++++++");
//init and calling using same class obj/Ref
        Bulb bulbObj = new HavellsBulb();
        bulbObj.bulbcolor="White";
        System.out.println("color of bulb using parent class type :"+bulbObj.bulbcolor);
        bulbObj.bulbOn();

    }

}