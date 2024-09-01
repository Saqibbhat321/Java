package com.xworkz.things;

import com.xworkz.things.market.Market;
import com.xworkz.things.market.OnlineMarket;
import com.xworkz.things.market.SuperMarket;

public class MarketRunner {


    public static void main(String[] args) {


        Market market = new Market("Roadside kitchen","JB layout",01,"kiryana");
        market.display();
        System.out.println("-----------------------------------");
        Market market1 = new Market("OnlyTea",02,"RajajiNagar");
        market1.display();


        System.out.println("=============SUPER MARKET========");
//        USING PARENT REFERENCE
        Market superMarket1 = new SuperMarket("Tea Bench","Halasuru",04,"Tea shop");
        superMarket1.display();
        System.out.println("<><><><>");
        SuperMarket superMarket = new SuperMarket("Kota Taste","RajajiNagar",03,"Resturant");
        superMarket.display();
        System.out.println(">>>>");
        SuperMarket superMarket2 = new SuperMarket("Dominoes","Marathahalli",10);
        superMarket2.display();

        System.out.println("========onLINE MARKET=============");
        OnlineMarket onlineMarket = new OnlineMarket("Amazon","India",34,"genreal SHop");
        onlineMarket.display();
        System.out.println("------");
        //USING PARENT REFERENCE
        Market onlinemarket1 = new OnlineMarket("Bata","Japan",54,"Footware");
        onlinemarket1.display();
    }
}
