package com.xworkz.streamapi.longcol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeMisnisters {


    public static void main(String[] args) {


        Collection<String> collection = new ArrayList<>();
        collection.add("Jawaharlal Nehru");
        collection.add("Gulzarilal Nanda");
        collection.add("Lal Bahadur Shastri");
        collection.add("Morarji Desai");
        collection.add("Charan Singh");
        collection.add("Indira Ghandhi");
        collection.add("Rajiv Gandhi");
        collection.add("V.P. Singh");
        collection.add("Chandra Shekhar");
        collection.add("P.V.Singh");
        collection.add("Narasimha Rao");
        collection.add("Atal Bihari Vajpayee");
        collection.add("H.D.Deve Gowda");
        collection.add("Inder Kumar Gujral");
        collection.add("Manmohan Singh");
        collection.add("Narendra Modi");


        List lis =collection.stream().sorted().collect(Collectors.toList());
        System.out.println(lis);
    }
}
