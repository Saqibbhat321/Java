package com.xworkz.collections.dto;

import com.xworkz.collections.constants.Continents;
import com.xworkz.collections.constants.CountryCode;

import java.io.Serializable;

public class CountryDTO implements Serializable {

    private String name;
    private CountryCode code;
    private long population;
    private String presidentName;
    private Continents continents;

    public CountryDTO()
    {
        System.out.println("NO arg conts. in countrydto");
    }
    public CountryDTO(String name, CountryCode code, int population, String presidentName, Continents continents) {
        this.name = name;
        this.code = code;
        this.population = population;
        this.presidentName = presidentName;
        this.continents = continents;
    }

    public String getName() {
        return name;
    }

    public CountryCode getCode() {
        return code;
    }

    public long getPopulation() {
        return population;
    }

    public String getPresidentName() {
        return presidentName;
    }

    public Continents getContinents() {
        return continents;
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", population=" + population +
                ", presidentName='" + presidentName + '\'' +
                ", continents=" + continents +
                '}';
    }
}
