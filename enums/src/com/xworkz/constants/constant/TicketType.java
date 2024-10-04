package com.xworkz.constants.constant;

public enum TicketType {

    ONLINE(250),OFFLINE(200);
    private int cost;

    TicketType(int cost)
    {
        this.cost=cost;
    }
    public int cost()
    {
        return cost;
    }

}

