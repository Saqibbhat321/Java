package com.xworkz.cap;

import com.xworkz.cap.external.User;
import com.xworkz.cap.internal.Company;
import com.xworkz.cap.internal.Television;

public class Runner {

    public static void main(String[] args) {

        Television television = new Television("Fake");
        String value = television.getQuality();
        System.out.println("quality is: "+value);
        television.setQuality("ORigininal");


       Company company = new Company(television);
       company.
    }
}
