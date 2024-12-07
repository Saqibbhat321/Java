package com.xworkz.collections.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class WeaponDTO implements Serializable {




    private  String name;
    private  String countryMade;
    private LocalDate manfDate;

    public WeaponDTO(int id, String name, String countryMade, LocalDate manfDate) {
        this.id = id;
        this.name = name;
        this.countryMade = countryMade;
        this.manfDate = manfDate;
    }
    private  int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getManfDate() {
        return manfDate;
    }

    public String getCountryMade() {
        return countryMade;
    }

    @Override
    public String toString() {
        return "\nid :"+id+" \nName: "+name+" \ncountryMade: "+countryMade+
                " \nmanufacture Date: "+manfDate;
    }

    @Override
    public int hashCode() {
        System.out.println("hascode method invoked");
        return Objects.hash(name, countryMade, manfDate, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeaponDTO weaponDTO = (WeaponDTO) o;
        return id == weaponDTO.id && Objects.equals(name, weaponDTO.name) && Objects.equals(countryMade, weaponDTO.countryMade) && Objects.equals(manfDate, weaponDTO.manfDate);
    }
}
