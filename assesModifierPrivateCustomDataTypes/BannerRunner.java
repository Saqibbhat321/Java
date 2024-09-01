package com.xworkz.assesModifierPrivateCustomDataTypes;
//CUSTOM DATA TYPE ARRAYS
public class BannerRunner {


    public static void main(String[] args) {


        Banner banner1 = new Banner();
        Banner banner2 = new Banner("Small","Plastic",85.90);
        Banner banner3 = new Banner("Large","Paper",499.39);

        Banner[] bannerArray = {banner1,banner2,banner3};

        for(int i=0;i<bannerArray.length;i++)
        {
            System.out.println("Reading ICe cream from index :" + i);
            Banner ref = bannerArray[i];
            ref.bannerDetails();
        }

    }
}
