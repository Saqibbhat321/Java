package com.xworkz.standards.addrreposerviceimpl;

import com.xworkz.standards.addressreposervice.AddressRepo;

public class AddressRepoImpl implements AddressRepo {



    @Override
    public boolean save() {
        System.out.println("this is repo method");
        return true;
    }

    @Override
    public int update() {
        return 1;
    }

    @Override
    public void delete() {

    }

    @Override
    public String read() {
        return "success";
    }
}
