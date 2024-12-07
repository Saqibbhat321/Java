package com.xworkz.customexception;

public class BankAccountExceptionRunner {
    public static void main(String[] args) {

        BankAccount bankAccount= new BankAccount();
        try{
            bankAccount.debit(5);
        }catch (InsufficientFundsException e)
        {
            e.printStackTrace();
        }


    }
}