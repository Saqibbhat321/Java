package com.xworkz.standards.runner;

import com.xworkz.standards.repository.AddressRepoImpl;
import com.xworkz.standards.repository.AddressRepo;
import com.xworkz.standards.service.AddressService;
import com.xworkz.standards.service.AddressServiceImpl;

public class AddrRepoServiceRunner {

    public static void main(String[] args) {
        AddressRepo addressRepo = new AddressRepoImpl();
        AddressService addressService = new AddressServiceImpl(addressRepo);
        addressService.push();
        addressService.refresh();
        addressService.load();
        addressService.remove();

    }
}
