package com.xworkz.constants.constant;

public enum SeatType {

    RECLINER(10),PREMIUM(15),EXECUTIVE(20);

    private int seatno;

    SeatType(int seatno) {
        this.seatno = seatno;
    }

    public int getSeatno() {
        return seatno;
    }
}
