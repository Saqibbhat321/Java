package com.xworkz.standards.vehiclereposerviceimpl;

import com.xworkz.standards.vehiclereposercive.VehicleRepository;
import com.xworkz.standards.vehiclereposercive.VehicleService;

public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;
    public VehicleServiceImpl(VehicleRepository vehicleRepository)
    {
        this.vehicleRepository = vehicleRepository;
    }
    @Override
    public boolean persist() {
        if(vehicleRepository!= null)
        {
            boolean saved = vehicleRepository.save();
            if(saved)
            {
                System.out.println("saved successfully");
            }
            else System.out.println("not saved");
        }
        return false;
    }

    @Override
    public int merge() {

        if(vehicleRepository!=null)
        {
            int upadated = vehicleRepository.update();
            if(upadated>=1)
            {
                System.out.println("merge successfull");
                return 1;
            }
            else System.out.println("merge failed");
            return 0;
        }
        return 0;
    }

    @Override
    public void clear() {
        if(vehicleRepository!=null)
        {
            vehicleRepository.delete();


        }

    }

    @Override
    public String search() {
        if(vehicleRepository!=null)
        {
            String readMsg =vehicleRepository.read();
            System.out.println("readMsg is: "+readMsg);
        }
        return "Failure";
    }
}
