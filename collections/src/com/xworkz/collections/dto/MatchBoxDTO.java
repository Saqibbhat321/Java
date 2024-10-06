package com.xworkz.collections.dto;

import java.io.Serializable;

public class MatchBoxDTO implements Serializable {


    private double cost;
    private  String name;

    public MatchBoxDTO(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MatchBoxDTO{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
