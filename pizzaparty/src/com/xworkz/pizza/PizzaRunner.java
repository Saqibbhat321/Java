package com.xworkz.pizza;

import com.xworkz.pizza.pizza.*;
import org.w3c.dom.ls.LSOutput;

public class PizzaRunner {


    public static void main(String[] args) {

        //using local
        Saqib saqib = new Saqib();
        saqib.order();
        System.out.println("================================");
        //using parameter
        Pizza pizza = new Pizza();
        TusharParam tusharParam = new TusharParam();
        tusharParam.deliver(pizza);

        System.out.println("----------------------");
        MaddyInstance maddyInstance = new MaddyInstance();
        maddyInstance.eating();

        System.out.println("______________________________________");
        Tomstatic tomstatic = new Tomstatic();
        tomstatic.drop();

        System.out.println("++++++++++++++++++++++++++++++++++++");
        Hanreturn hanreturn = new Hanreturn();
        Pizza ref=hanreturn.wrap();
        if(ref!=null)
        {
            System.out.println(ref.cost);
            System.out.println(ref.name);
            ref.satisfyCraving();
        }
    }



}
