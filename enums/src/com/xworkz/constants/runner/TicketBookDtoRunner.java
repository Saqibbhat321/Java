package com.xworkz.constants.runner;

import com.xworkz.constants.constant.SeatType;
import com.xworkz.constants.constant.TicketType;
import com.xworkz.constants.dto.TicketBookDTO;

public class TicketBookDtoRunner {

    public static void main(String[] args) {


        TicketBookDTO ticketBookDTO = new TicketBookDTO("Salaar","PVR cinema", TicketType.ONLINE, SeatType.PREMIUM);
        System.out.println(ticketBookDTO.getMovieName());
        System.out.println(ticketBookDTO.getTicketType().cost());
        System.out.println(ticketBookDTO.getTheaterName());
        System.out.println(ticketBookDTO.getSeatType());
    }
}
