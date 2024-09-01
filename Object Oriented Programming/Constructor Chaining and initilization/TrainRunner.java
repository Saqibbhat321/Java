package com.xworkz.things;

import com.xworkz.things.transport.MetroTrain;
import com.xworkz.things.transport.SubUrbanTrain;
import com.xworkz.things.transport.Train;

public class TrainRunner {
    public static void main(String[] args) {

    Train train = new Train("TNT20001","krpuram","majestic");
    train.show();
        System.out.println("HEHEHEHHEHEHHEHEHEHEHEHHEHEHHEHEHEHHEE");
    Train train1 = new Train("Hebbal","Halasuru");
    train1.show();

        System.out.println(">>>>>><<<<<<<<<>>>><<<<<>>>>><<<<<<<><><><");
        //USING PARENT REFERENCE
        Train metroTrain = new MetroTrain("PNP5004","Trinity","Beniganhalli");
        metroTrain.show();

        MetroTrain metroTrain1 = new MetroTrain("bengaluru","Goa");
        metroTrain1.show();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++=");
        //USING PARENT REFERENCE
        Train subUrbanTrain = new SubUrbanTrain("TRT00002","Hyderabad","Delhi");
        subUrbanTrain.show();

        System.out.println("--------------------------------------------");
        SubUrbanTrain subUrbanTrain1 = new SubUrbanTrain();
        subUrbanTrain1.show();
    }

}
