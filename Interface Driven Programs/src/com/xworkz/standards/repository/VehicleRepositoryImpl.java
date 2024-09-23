package com.xworkz.standards.vehiclereposerviceimpl;

import com.xworkz.standards.vehiclereposercive.VehicleRepository;

public class VehicleRepositoryImpl implements VehicleRepository {
    @Override
    public boolean save() {
        return true;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public void delete() {
        System.out.println("deleted successfully");
    }

    @Override
    public String read() {
        return "Success";
    }
}
