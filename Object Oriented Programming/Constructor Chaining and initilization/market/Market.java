package com.xworkz.things.market;

public class Market {


    private String name;
    private String loc;
    private int shopNo;
    private String typeOfShop;

    public Market(String name, int shopNo, String loc) {
        this.name = name;
        this.shopNo = shopNo;
        this.loc = loc;
    }

    public Market(String name, String loc, int shopNo, String typeOfShop) {
        this.name = name;
        this.loc = loc;
        this.shopNo = shopNo;
        this.typeOfShop = typeOfShop;

    }

    public void display()
    {
        System.out.println("name of shop: "+name);
        System.out.println("Location of shop: "+loc);
        System.out.println("shop Number: "+shopNo);
        System.out.println("type of shop: "+typeOfShop);
    }

}
