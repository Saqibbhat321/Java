package com.xworkz.collections.runner;

import com.xworkz.collections.constants.Continents;
import com.xworkz.collections.constants.CountryCode;
import com.xworkz.collections.dto.CountryDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryRunner {


    public static void main(String[] args) {


        CountryDTO dto = new CountryDTO("Afghanistan", CountryCode.AFG, 42647492, "Hibatullah Akhundzada", Continents.ASIA);
        CountryDTO dto1 = new CountryDTO("Albania", CountryCode.ALB, 2800000, "Bajram Begaj", Continents.EUROPE);
        CountryDTO dto2 = new CountryDTO("Algeria", CountryCode.DZA, 4490000, "Abdelmadjid Tebboune", Continents.AFRICA);
        CountryDTO dto3 = new CountryDTO("American Samoa", CountryCode.ASM, 46765, "Joe Biden", Continents.ANTARCTICA);
        CountryDTO dto4 = new CountryDTO("Andorra", CountryCode.AND, 81938, "Xavier Espot Zamora", Continents.EUROPE);
        CountryDTO dto5 = new CountryDTO("Angola", CountryCode.AGO, 37885849, "João Lourenço", Continents.AFRICA);
        CountryDTO dto6 = new CountryDTO("Anguilla", CountryCode.AIA, 36455849, "Ellis Webster", Continents.NORTH_AMERICA);
        CountryDTO dto7 = new CountryDTO("Antigua and Barbuda", CountryCode.ATG, 93772, "Honourable Gaston", Continents.NORTH_AMERICA);
        CountryDTO dto8 = new CountryDTO("Argentina", CountryCode.ARG, 45696159, "Javier Milei", Continents.SOUTH_AMERICA);
        CountryDTO dto9 = new CountryDTO("Armenia", CountryCode.ARM, 2973840, "Vahagn Khachaturyan", Continents.ASIA);
        CountryDTO dto10 = new CountryDTO("Aruba", CountryCode.ABW, 108066, "Evelyn Wever-Croes", Continents.SOUTH_AMERICA);
        CountryDTO ref = new CountryDTO("Australia", CountryCode.AUS, 26713205, "Anthony Albanese", Continents.AUSTRALIA);
        CountryDTO ref1 = new CountryDTO("Austria", CountryCode.AUT, 5601050, "Alexander Van der Bellen", Continents.EUROPE);
        CountryDTO ref2 = new CountryDTO("Azerbaijan", CountryCode.AZE, 5601050, "Ilham Aliyev", Continents.ASIA);
        CountryDTO ref3 = new CountryDTO("Bahamas", CountryCode.BHS, 401283, "Philip Davis", Continents.NORTH_AMERICA);
        CountryDTO ref4 = new CountryDTO("Bahrain", CountryCode.BHR, 1607049, "Salman bin Hamad Al Khalifa", Continents.ASIA);
        CountryDTO ref5 = new CountryDTO("Bangladesh", CountryCode.BGD, 173562364, "Mohammed Shahabuddin", Continents.ASIA);
        CountryDTO ref6 = new CountryDTO("Barbados", CountryCode.BRB, 282467, "Sandra Mason", Continents.NORTH_AMERICA);
        CountryDTO ref7 = new CountryDTO("Belarus", CountryCode.BLR, 20802467, "Philip Milei", Continents.EUROPE);
        CountryDTO ref8 = new CountryDTO("Belgium", CountryCode.BEL, 11738763, "Alexander De", Continents.EUROPE);
        CountryDTO ref9 = new CountryDTO("Belgium-Luxembourg", CountryCode.BLX, 673036, "Xavier Bettel", Continents.EUROPE);
        CountryDTO ref10 = new CountryDTO("Belize", CountryCode.BLZ, 417072, "Johnny Briceño", Continents.NORTH_AMERICA);
        CountryDTO ref11 = new CountryDTO("Benin", CountryCode.BEN, 47072, "Patrice Talon", Continents.AFRICA);
        CountryDTO ref12 = new CountryDTO("Bermuda", CountryCode.BMU, 63935, "Edward David", Continents.NORTH_AMERICA);
        CountryDTO ref13 = new CountryDTO("Bhutan", CountryCode.BTN, 792382, "Tshering Tobgay", Continents.ASIA);
        CountryDTO ref14 = new CountryDTO("Bolivia", CountryCode.BOL, 12413315, "Luis Arce Catacora", Continents.SOUTH_AMERICA);


        Collection<CountryDTO> countryDTOS = new ArrayList<>();
        countryDTOS.add(dto);
        countryDTOS.add(dto1);
        countryDTOS.add(dto2);
        countryDTOS.add(dto3);
        countryDTOS.add(dto4);
        countryDTOS.add(dto5);
        countryDTOS.add(dto6);
        countryDTOS.add(dto7);
        countryDTOS.add(dto8);
        countryDTOS.add(dto9);
        countryDTOS.add(dto10);
        countryDTOS.add(ref);
        countryDTOS.add(ref1);
        countryDTOS.add(ref2);
        countryDTOS.add(ref3);
        countryDTOS.add(ref4);
        countryDTOS.add(ref5);
        countryDTOS.add(ref6);
        countryDTOS.add(ref7);
        countryDTOS.add(ref8);
        countryDTOS.add(ref9);
        countryDTOS.add(ref10);
        countryDTOS.add(ref11);
        countryDTOS.add(ref12);
        countryDTOS.add(ref13);
        countryDTOS.add(ref14);


        System.out.println(countryDTOS.size());
        System.out.println(countryDTOS.isEmpty());

        Iterator<CountryDTO> iterator = countryDTOS.iterator();

        while(iterator.hasNext())
        {
           CountryDTO itr =iterator.next();
            System.out.println(itr);
        }


    }
}