package com.xworkz.standards.runner;

import com.xworkz.standards.repository.MachineRepoImpl;
import com.xworkz.standards.service.MachineService;
import com.xworkz.standards.service.MachineServiceImpl;

public class MachineRunner {

    public static void main(String[] args) {


        MachineRepoImpl machineRepo = new MachineRepoImpl();
        MachineService machineService = new MachineServiceImpl(machineRepo);
        machineService.save();
        int upadated = machineService.update();
        System.out.println("upadte status: "+upadated);
        int deleted = machineService.delete();
        System.out.println("delete status: "+deleted);
        int read = machineService.read();
        System.out.println("read status: "+read);
    }
}
