package com.xworkz.assesModifierPrivateCustomDataTypes;
//CUSTOM DATA TYPE ARRAYS
public class WheelRunner {

    public static void main(String[] args) {
        GaintWheel wheel1 =new GaintWheel();
        GaintWheel wheel2 =new GaintWheel("large","White",10000);
        GaintWheel wheel3 =new GaintWheel("Small","Brown",50000);

        GaintWheel[] gaintArray = {wheel1,wheel2,wheel3};

        for(int elements =0;elements<gaintArray.length;elements++)
        {
            System.out.println("this is custom datatype printing details");
           GaintWheel ref = gaintArray[elements];
           ref.wheelDetails();
        }

    }
}
