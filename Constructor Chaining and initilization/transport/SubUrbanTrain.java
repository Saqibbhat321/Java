package com.xworkz.things.transport;

public class SubUrbanTrain extends Train {


    public SubUrbanTrain(String trno, String source, String dest)
    {
//        super("TRT30001","Hyderabad","Delhi");
        super(trno,source,dest);
    }

    public SubUrbanTrain()
    {
        super("KK99999","Kerala","Udupi");
    }
}
