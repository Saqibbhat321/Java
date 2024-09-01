package com.saqib.data;

public class SandalData {

    private String brand;
    private  double cost;
    private int items;

    public SandalData(String brand, double cost,int items) {
        this.brand = brand;
        this.cost = cost;
        this.items =items;
    }

    public void viewDetails()
    {
        System.out.println("brand: "+this.brand);
        System.out.println("cost: "+this.cost);
        System.out.println("no of items: "+this.items);
    }
}
