package com.xworkz.inheritance.objects;

public class Chicken {


    public String size;
    public double weight;
    public String purpose;
    public int lifeSpan;
    public Chicken()
    {
        System.out.println("runnig no-arg const... in parent class");
    }

    public void layEggs()
    {
        System.out.println(" method, laying eggs in parents class ");
    }
    public void kukuku()
    {
        System.out.println("method, kukukuing in parent class");
    }
    public void noddingHead()
    {
        System.out.println("method, nodding head in parent class");
    }
    public void eat()
    {
        System.out.println("method, eating in parent class");
    }


}
