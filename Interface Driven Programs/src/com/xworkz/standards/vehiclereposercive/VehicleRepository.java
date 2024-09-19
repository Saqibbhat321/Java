package com.xworkz.standards.vehiclereposercive;

public interface VehicleRepository {

    boolean save();
    int update();
    void delete();
    String read();
}
