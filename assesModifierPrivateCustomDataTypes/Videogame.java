package com.xworkz.assesModifierPrivateCustomDataTypes;

public class Videogame {

    private String gameName;
    private int size;
    private double cost;

    public Videogame()
    {
        System.out.println("no argument constructor");
    }

    public Videogame(String gameName, int size,double cost)
    {
        this.cost=cost;
        this.size = size;
        this.gameName = gameName;
    }

    public void videoDetails()
    {
        System.out.println("game name is :"+this.gameName);
        System.out.println("cost of video game is :"+this.cost);
        System.out.println("size of video game in mb's is :"+this.size);
    }

}
