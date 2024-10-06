package com.xworkz.collections.dto;

public class ProductGeneric<T,D> {

    T name;
    D cost;

    public ProductGeneric(D cost, T name) {
        this.cost = cost;
        this.name = name;
    }

    public void display()
    {
        System.out.println(name);
        System.out.println(cost);
    }
}
