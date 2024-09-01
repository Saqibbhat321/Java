package com.xworkz.things.transport;

public class Train {


    String trainNo;
    String source;
    String destination;

    public Train(String trainNo, String source, String destination) {
        this.trainNo = trainNo;
        this.source = source;
        this.destination = destination;
    }

    public Train(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
    public void show()
    {
        System.out.println("Train no "+trainNo);
        System.out.println("Source "+source);
        System.out.println("Destination "+destination);
    }
}
