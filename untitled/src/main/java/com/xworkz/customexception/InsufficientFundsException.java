package com.xworkz.customexception;

public class InsufficientFundsException extends Exception{


    public InsufficientFundsException(String msg)
    {
        super(msg);
    }
}
