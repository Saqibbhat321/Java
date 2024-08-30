package com.xworkz.inheritance.objects;


    public class HavellsBulb extends Bulb{


       public HavellsBulb()
        {
            //super(); it will be implicitly called in case of no-arg const..
            //constructor Chaining
            System.out.println("Const... Running in Sub-Class");
        }
        public void lighting()
        {
            System.out.println("lighting method in Sub-Class");
        }
    }
