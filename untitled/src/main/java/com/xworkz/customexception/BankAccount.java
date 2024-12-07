package com.xworkz.customexception;

public class BankAccount {
    double amt=10;
    public void debit(double amt) throws InsufficientFundsException {
        if(amt>10)
        {
            throw new InsufficientFundsException("Insufficeint amount");
        }
        else
        {
            System.out.println("balance deducted");
        }
    }
}
