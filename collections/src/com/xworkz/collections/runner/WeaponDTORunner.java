package com.xworkz.collections.runner;

import com.xworkz.collections.dto.WeaponDTO;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class WeaponDTORunner {



    public static void main(String[] args) {

        Set<WeaponDTO> weaponDTOSet=new HashSet<>();

        WeaponDTO weaponDTO1 = new WeaponDTO(1,"Kalashnikov","Russia", LocalDate.of(2029,05,06));
        WeaponDTO weaponDTO2 = new WeaponDTO(2,"SVD","Russia",LocalDate.of(2025,5,21));
        WeaponDTO weaponDTO3 = new WeaponDTO(3,"Desert Eagle","USA",LocalDate.of(2024,2,3));
        WeaponDTO weaponDTO4 = new WeaponDTO(4,"MPS","Germany",LocalDate.of(2021,9,13));
        WeaponDTO weaponDTO5 = new WeaponDTO(5,"AK-47","Russia",LocalDate.of(2022,4,30));
        WeaponDTO weaponDTO6 = new WeaponDTO(6,"FAMAS","France",LocalDate.of(2018,6,12));
        WeaponDTO weaponDTO7 = new WeaponDTO(7,"Scar-L","Belgium",LocalDate.of(2032,5,10));
        WeaponDTO weaponDTO8 = new WeaponDTO(8,"Steyr AUG","Austria",LocalDate.of(2025,5,10));
        WeaponDTO weaponDTO9 = new WeaponDTO(9,"Scar-L","Belgium",LocalDate.of(2050,5,10));
        WeaponDTO weaponDTO10 = new WeaponDTO(10,"Scar-L","Belgium",LocalDate.of(2010,5,10));
        WeaponDTO weaponDTO11 = new WeaponDTO(10,"Scar-L","Belgium",LocalDate.of(2010,5,10));



        weaponDTOSet.add(weaponDTO1);
        weaponDTOSet.add(weaponDTO2);
        weaponDTOSet.add(weaponDTO3);
        weaponDTOSet.add(weaponDTO4);
        weaponDTOSet.add(weaponDTO5);
        weaponDTOSet.add(weaponDTO6);
        weaponDTOSet.add(weaponDTO7);
        weaponDTOSet.add(weaponDTO8);
        weaponDTOSet.add(weaponDTO9);
        weaponDTOSet.add(weaponDTO10);
        weaponDTOSet.add(weaponDTO11);
        System.out.println("number of dtos "+weaponDTOSet.size());

        //2. Get all weapons where manfDate is greater than 2024
//        List<WeaponDTO> lessthan2024 =weaponDTOSet.stream().filter(md->md.getManfDate().getYear()<2024).collect(Collectors.toList());

        //3. Get all weapons where manfDate is less than 2024
//        List<WeaponDTO> morethan2024 = weaponDTOSet.stream().filter(md->md.getManfDate().getYear()>2024).collect(Collectors.toList());

        //4. Get a weapon by id , use optional to check and retrieve
//        Optional<WeaponDTO> weaponById = weaponDTOSet.stream().filter(id->id.getId()==6).findFirst();

        //5. Sort elements by id in desc order
//        List<WeaponDTO> sortedWeaponinDesc = weaponDTOSet.stream().sorted(Comparator.comparingInt(WeaponDTO::getId).reversed()).collect(Collectors.toList());
//        System.out.println("Weapons manufactured after 2024  "+lessthan2024);
//        System.out.println("Weapons manufactured before 2024  "+morethan2024);
//        weaponById.ifPresent(System.out::println);
//        System.out.println("weapon by id: "+weaponById);
//        System.out.println("Weapons SOrted in Descending order by id: "+sortedWeaponinDesc);
    }
}
