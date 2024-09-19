package com.xworkz.standards.runner;

import com.xworkz.standards.vehiclereposercive.VehicleRepository;
import com.xworkz.standards.vehiclereposercive.VehicleService;
import com.xworkz.standards.vehiclereposerviceimpl.VehicleRepositoryImpl;
import com.xworkz.standards.vehiclereposerviceimpl.VehicleServiceImpl;

public class VehicleRepoServiceRunner {
    public static void main(String[] args) {


        VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
        VehicleService vehicleService = new VehicleServiceImpl(vehicleRepository);
        vehicleService.persist();
        vehicleService.merge();
        vehicleService.search();
        vehicleService.clear();
    }
}
