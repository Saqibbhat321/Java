package com.xworkz.collections.runner;

import com.xworkz.collections.dto.MatchBoxDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MatchBoxRunner {

    public static void main(String[] args) {


        MatchBoxDTO matchBox = new MatchBoxDTO(2.5,"AIM");
        MatchBoxDTO matchBox1 = new MatchBoxDTO(1,"Express");
        MatchBoxDTO matchBox2 = new MatchBoxDTO(1.5,"Golden");
        MatchBoxDTO matchBox3 = new MatchBoxDTO(3,"HomeStick");
        MatchBoxDTO matchBox4 = new MatchBoxDTO(3.4,"Essence");


        Collection<MatchBoxDTO> collection = new ArrayList<>();
        collection.add(matchBox);
        collection.add(matchBox1);
        collection.add(matchBox2);
        collection.add(matchBox3);
        collection.add(matchBox4);


        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
//        System.out.println("after clear");
//        collection.clear();
//        System.out.println(collection.size());
//        System.out.println(collection.isEmpty());

        Iterator<MatchBoxDTO> iterator = collection.iterator();  //Iterator interface h

        while(iterator.hasNext())
        {
            MatchBoxDTO ref =iterator.next();
            System.out.println(ref);

        }




    }
}
