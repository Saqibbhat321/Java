package com.xworkz.assesModifierPrivateCustomDataTypes;

public class VideogameRunner {

    public static void main(String[] args) {


        Videogame videogame1 = new Videogame("GTA IV",900,1000);
        Videogame videogame2 = new Videogame();
        Videogame videogame3 = new Videogame("COD Black OPs",670,999);

       // System.out.println(videogame1.gameName);  this will result in compile error because instance variables has private access in that class
        Videogame[] games ={videogame1,videogame2,videogame3};
        for (Videogame ref : games) {
            System.out.println("printing details using custom datatypes: ");
            ref.videoDetails();
        }
    }
}
