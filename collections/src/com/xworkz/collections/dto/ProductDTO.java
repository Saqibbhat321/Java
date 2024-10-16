package com.xworkz.collections.dto;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.io.Serializable;
import java.util.function.DoubleUnaryOperator;

public class ProductDTO implements Serializable, Comparable<ProductDTO> {


    private int id;
    private String name;
    private String vendor;
    private double cost;

    public ProductDTO() {
        System.out.println("No arg constructor");
    }

    public ProductDTO(int id, String name, String vendor, double cost) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(ProductDTO o) {
//        return this.name.compareTo(o.name);
        return Double.compare(this.cost,o.cost);
    }



}
