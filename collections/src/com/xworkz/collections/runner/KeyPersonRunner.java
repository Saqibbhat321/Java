package com.xworkz.collections.runner;

import com.xworkz.collections.fuctionalinterface.Person;
import com.xworkz.collections.fuctionalinterface.ifinterface.FoodApp;
import com.xworkz.collections.fuctionalinterface.ifinterface.Key;

public class KeyPersonRunner {


    public static void main(String[] args) {


        Key key = ()->{

            System.out.println("Runnnnnnnnnnnnnnnnnnnnnn");
        };
        Person person= new Person();
        person.starting(key);

        FoodApp foodApp=(food)->{

            System.out.println("food is "+food);
        };
        person.detail(foodApp);
    }
}
