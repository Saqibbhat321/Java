package com.xworkz.collections.fuctionalinterface;

import com.xworkz.collections.fuctionalinterface.ifinterface.FoodApp;
import com.xworkz.collections.fuctionalinterface.ifinterface.Key;

public class Person {


    public void starting(Key key)
    {
        if(key!=null) // if not given might throw NULL Pointer Exception
        {
            key.startCar();
        }
        else
            System.out.println("key is null");
    }
     public  void detail(FoodApp foodApp)
     {
         if(foodApp!=null)
         {
             foodApp.order("Fried Rice");
         }
     }
}
