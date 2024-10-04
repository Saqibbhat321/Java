package com.xworkz.exceptions.runners;

import com.xworkz.exceptions.throwthrows.Emailexception;

public class Emailservice {

    public void emailgiven(String email)throws Emailexception
    {
        if(email == null && email.contains("@") && email.endsWith(".com");
        {
        throw new Emailexception();
    }
    }
}
