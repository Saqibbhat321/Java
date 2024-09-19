package com.xworkz.standards.runner;

import com.xworkz.standards.addrreposerviceimpl.AddressRepoImpl;
import com.xworkz.standards.addressreposervice.AddressRepo;
import com.xworkz.standards.addressreposervice.AddressService;
import com.xworkz.standards.addrreposerviceimpl.AddressServiceImpl;

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
