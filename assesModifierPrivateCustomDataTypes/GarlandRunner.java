package com.xworkz.assesModifierPrivateCustomDataTypes;

public class GarlandRunner {


    public static void main(String[] args) {


        Garland garland = new Garland("Roses",250,"Small");
        Garland garland1 = new Garland();
        Garland garland2 = new Garland("Lavender",500,"Large");
        Garland[] g1 ={garland,garland1,garland2};
        for(Garland ele:g1)
        {
            System.out.println("Custom datatype pirnting");
            ele.garlandDetails();
        }

    }
}
