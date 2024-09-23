package com.xworkz.standards.repository;

public interface AddressRepo {

    boolean save();
    int update();
    void delete();
    String read();
}
