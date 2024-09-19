package com.xworkz.standards.addressreposervice;

public interface AddressRepo {

    boolean save();
    int update();
    void delete();
    String read();
}
