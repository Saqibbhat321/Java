package com.xworkz.constants.runner;

import com.xworkz.constants.constant.ProductType;
import com.xworkz.constants.dto.CustomerDTO;


public class CustDTORunner
{

    public static void main(String[] args) {


        CustomerDTO customerDTO = new CustomerDTO("Saaqi","saqi@gmail.com", ProductType.FOOTWEAR);

        System.out.println(customerDTO.getName());
        System.out.println(customerDTO.getEmail());
        System.out.println(customerDTO.getProductType());


    }
}
