package com.xworkz.streamapi.longcol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StatesOfIndia {


    public static void main(String[] args) {


        Collection<String> collection = new ArrayList<>();

        collection.add("Andhra Pradesh");
        collection.add("Karnataka");
        collection.add("Kerala");
        collection.add("Madhya Pradesh");
        collection.add("Maharashtra");
        collection.add("Haryana");
        collection.add("Himachal Pradesh");
        collection.add("Jharkhand");
        collection.add("Karnataka");
        collection.add("Kerala");
        collection.add("Madhya Pradesh");
        collection.add("Maharashtra");
        collection.add("Bihar");
        collection.add("Chhattisgarh");
        collection.add("Goa");
        collection.add("Gujarat");
        collection.add("Telangana");
        collection.add("Uttarakhand");
        collection.add("Uttar Pradesh");
        collection.add("West Bengal");
        collection.add("Manipur");
        collection.add("Mizoram");
        collection.add("Nagaland");
        collection.add("Odisha");
        collection.add("Punjab");
        collection.add("Rajasthan");
        collection.add("Sikkim");
        collection.add("Tamil Nadu");
        collection.add("Arunachal Pradesh");
        collection.add("Assam");



        List list = collection.stream().sorted().collect(Collectors.toList());
        System.out.println(list);

        System.out.println("descending order using foreach method");
        collection.stream().sorted((ele1,ele2)->ele2.compareTo(ele1)).forEach(ref -> System.out.println("Prime Minister: "+ref));
    }
}
