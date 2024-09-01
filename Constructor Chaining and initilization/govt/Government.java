package com.xworkz.things.govt;

public class Government{


    private String stateName;
    private int noOfMla;
    private String partyHeadName;
    private String homeMname;

    public Government(String stateName, int noOfMla, String partyHeadName, String homeMname) {
        this.stateName = stateName;
        this.noOfMla = noOfMla;
        this.partyHeadName = partyHeadName;
        this.homeMname = homeMname;
    }

    public Government(String stateName, String homeMname) {
        this.stateName = stateName;
        this.homeMname = homeMname;
    }

    public void print()
    {
        System.out.println("State Name: "+stateName);
        System.out.println("No of MLA's: "+noOfMla);
        System.out.println("Party Head Name: "+partyHeadName);
        System.out.println("Home Minister Name: "+homeMname);
    }
}
