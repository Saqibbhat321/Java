package com.xworkz.constants.runner;

import com.xworkz.constants.constant.SeatType;

public class SeatRunner {


    public static void main(String[] args) {


        SeatType seatType = SeatType.EXECUTIVE;
//        int seatType1 = SeatType.EXECUTIVE.getSeatno();      seattype.Executive returns SeatType,
//        System.out.println(seatType1);                       and .getSeatno() reuturns int
        System.out.println(seatType);
        System.out.println("executive seatno: "+seatType.getSeatno());

        System.out.println(SeatType.PREMIUM);
        System.out.println(SeatType.PREMIUM.getSeatno());

        System.out.println(SeatType.RECLINER);
        System.out.println(SeatType.RECLINER.getSeatno());
    }
}
