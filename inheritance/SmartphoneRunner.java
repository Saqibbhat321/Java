package com.xworkz.inheritance;

import com.xworkz.inheritance.objects.NokiaSmartphone;
import com.xworkz.inheritance.objects.Smartphone;

public class SmartphoneRunner {

    public static void main(String[] args) {

        NokiaSmartphone nokiaSmartphone = new NokiaSmartphone();
        //init parent class iv
        nokiaSmartphone.touch= true;
        System.out.println("touch is present or not "+nokiaSmartphone.touch);
        nokiaSmartphone.color = "black";
        System.out.println(" color of Nokia smartphone "+nokiaSmartphone.color);
        nokiaSmartphone.cost = 10000;
        System.out.println(" cost of Nokia smartphone "+nokiaSmartphone.cost);
        nokiaSmartphone.yearOfOrigin = 2000;
        System.out.println("year of origin of smartphone "+nokiaSmartphone.yearOfOrigin);
        nokiaSmartphone.logoOfNokia();
        //parent class methods
        nokiaSmartphone.alarm();
        nokiaSmartphone.call();
        nokiaSmartphone.listeningMusic();
        nokiaSmartphone.watching();
        System.out.println("==============================");
        //datatype of parent class and creating object of child class;
        Smartphone smartphone = new NokiaSmartphone();
        smartphone.color="white";
        System.out.println("Basic color of smartphone "+smartphone.color);
        smartphone.touch=true;
        System.out.println("touch is present or not "+smartphone.touch);
        smartphone.cost = 50000;
        System.out.println("Basic cost of smartphone "+smartphone.cost);
        smartphone.yearOfOrigin=1999;
        System.out.println("year of origin of Nokia smartphone "+smartphone.yearOfOrigin);
        smartphone.call();
        smartphone.alarm();
        smartphone.listeningMusic();
        smartphone.watching();


    }
}
