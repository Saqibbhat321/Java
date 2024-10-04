package com.xworkz.constants.runner;


import com.xworkz.constants.constant.TicketType;

public class TicketRunner {

    public static void main(String[] args) {


        TicketType ticketType = TicketType.OFFLINE;
        System.out.println(ticketType);
        String ticketType1 = TicketType.ONLINE.getStatus();
        System.out.println("cost "+ticketType1);
        System.out.println(TicketType.OFFLINE);
        System.out.println(TicketType.OFFLINE.getStatus());
    }
}

