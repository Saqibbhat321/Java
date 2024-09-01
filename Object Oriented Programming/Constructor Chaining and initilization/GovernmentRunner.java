package com.xworkz.things;

import com.xworkz.things.govt.CentralGovt;
import com.xworkz.things.govt.Government;
import com.xworkz.things.govt.StateGovernment;

public class GovernmentRunner {


    public static void main(String[] args) {

        Government government = new Government("Mars",1,"Saqib","Saqib Bhat");
        government.print();


        StateGovernment stateGovernment = new StateGovernment("Maharastra",288,"Uddhav Thackeray","Dilip walse Patil");
        stateGovernment.print();
        System.out.println("------");
        //USING PARENT REFERENCE
        Government stateasgovt = new StateGovernment("Tamil nadu",234,"M.K Stalin","M.K Stalin");
        stateasgovt.print();
        System.out.println("--------");
        Government stateasgovt1 = new StateGovernment("Tamil Nadu","M.K Stalin");
        stateasgovt1.print();

        System.out.println("=============Central Govt===============");
        //using parent reference
        Government centralasgovt = new CentralGovt("Karnataka",224,"INC","H.K Patil");
        centralasgovt.print();
        CentralGovt centralGovt = new CentralGovt("West Bengal","Mamata Banerjee");
        centralGovt.print();
    }
}
