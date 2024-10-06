package com.xworkz.collections.runner;

import com.xworkz.collections.dto.ProductGeneric;

public class GenericRunner {


    public static void main(String[] args) {


        ProductGeneric<String,Double> productGeneric =
                new ProductGeneric<>(232.4,"yho");

        ProductGeneric<Integer,Boolean> productGeneric1 =
                new ProductGeneric<>(true,234);

        productGeneric.display();
        productGeneric1.display();
    }
}
