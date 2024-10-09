package com.xworkz.streamapi.longcol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhNum {

    public static void main(String[] args) {


        Collection<Long> collection = new ArrayList<>();

        collection.add(123456789L);
        collection.add(679123456L);
        collection.add(789456123L);
        collection.add(23456789L);
        collection.add(345678912L);
        collection.add(456789123L);
        collection.add(567891234L);
        collection.add(891234678L);
        collection.add(9123465678L);
        collection.add(345678912L);
        collection.add(456789123L);
        collection.add(2546875124L);


        List lis = collection.stream().sorted().collect(Collectors.toList());
        System.out.println("Phone Number: "+lis);

        
        System.out.println("descending order using foreach method");
        collection.stream().sorted((ele1,ele2)->ele2.compareTo(ele1)).forEach(ref -> System.out.println("Phone Numbers: "+ref));
    }
}
