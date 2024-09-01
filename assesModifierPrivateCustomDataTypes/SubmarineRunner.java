package com.xworkz.assesModifierPrivateCustomDataTypes;

public class SubmarineRunner {

    public static void main(String[] args) {


        Submarine sub1 = new Submarine(true,10,1000,"military",5000);
        Submarine sub2 = new Submarine(false,0,0,"Commercial",0);
        Submarine sub3 = new Submarine(true,198,53240,"DeadTankSquad",10000);

        sub1.setHasSonar(true);
        sub1.setStealthy(true);
        sub1.setArmed(true);
        sub1.setCountryOfOrigin("Russia");
        sub1.setUnderRepair(true);

        sub2.setHasSonar(true);
        sub2.setStealthy(false);
        sub2.setArmed(false);
        sub2.setCountryOfOrigin("United Kingdom");
        sub2.setUnderRepair(true);

        sub3.setHasSonar(true);
        sub3.setStealthy(true);
        sub3.setArmed(true);
        sub3.setCountryOfOrigin("India");
        sub3.setUnderRepair(false);

        Submarine[] subarr = new Submarine[3];

        subarr[0]=sub1;
        subarr[1]=sub2;
        subarr[2]=sub3;

        for(int i = 0; i<subarr.length; i++)
        {
            Submarine ref = subarr[i];
            System.out.println("Trying to print ref of Non primitive reference"+ref);
            // *****THIS WILL PRINT STRING REPRESENTATION i.e:FQN.datatype@hexadecimal
            //the above statement does not print details because we cannot print details using non primitive(custom datatype) reference
            ref.submarineDetails();
            System.out.println("______________________________________________________________________________");
        }






    }
}
