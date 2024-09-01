package com.xworkz.things.market;

public class SuperMarket extends Market{


    public SuperMarket(String name, String location,int shopnum,String type)
    {
        super(name,location,shopnum,type);
    }
    public  SuperMarket(String name,String loc,int shopno)
    {
        super(name,shopno,loc);
    }
}
