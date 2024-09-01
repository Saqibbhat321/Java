package com.xworkz.things.transport;



public class MetroTrain extends Train {

    public MetroTrain(String trainNo,String source,String destination)
    {
        super(trainNo,source,destination);
        System.out.println("this is child class of trian");
    }
    public MetroTrain(String source,String destonation)
    {
        super(source,destonation);
    }
}
