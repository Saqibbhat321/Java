package com.xworkz.inheritance.objects;

public class Smartphone {

    public boolean touch ;
    public int cost;
    public int yearOfOrigin;
    public String color;

    public Smartphone()
    {
        System.out.println("parent class no-arg const....");
    }
    public void call()
    {
        System.out.println("Calling method in parent class");
    }
    public void listeningMusic()

    {
        System.out.println("listening music in parent class");
    }

    public void alarm()
    {
        System.out.println("setting alarm in parent class");
    }
    public void watching()
    {
        System.out.println("watching movies in parent class");
    }
}
