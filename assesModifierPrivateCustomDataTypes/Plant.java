package com.xworkz.assesModifierPrivateCustomDataTypes;

public class Plant {

    private String type;
    private boolean fruits;
    private String name;
    private int numbers;
    private String climateReq;
    private double costOfplant;
    private int height;
    private String colorOfFlower;
    private boolean available;
    private String size;


    public Plant(String type, boolean fruits, String name,int numbers,String climateReq)
    {
        this.type = type;
        this.name = name;
        this.numbers = numbers;
        this.climateReq = climateReq;
        this.fruits = fruits;
    }

    public void setCostOfPlant(double costOfplant)
    {
        this.costOfplant = costOfplant;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
    public void setAvailable(boolean available)
    {
        this.available = available;

    }
    public void setColorOfFlower(String colorOfFlower)
    {
        this.colorOfFlower = colorOfFlower;

    }
    public void setSize(String size)
    {
        this.size = size;

    }
    public void details()
    {
        System.out.println("Name of plant is: "+this.name);
        System.out.println("type of plant is :"+this.type);
        System.out.println("plant available :"+available);
        System.out.println("fruits available: "+this.available);
        System.out.println("color of flower is :"+colorOfFlower);
        System.out.println("height is :"+height);
        System.out.println("size of plant is :"+size);
        System.out.println("cost of plant is :"+this.costOfplant);

        System.out.println("Number of plants are: "+this.numbers);
        System.out.println("climate required: "+this.climateReq);
    }

}
