package com.xworkz.standards.service;

import com.xworkz.standards.repository.MachineRepo;

public class MachineServiceImpl implements MachineService{

    MachineRepo machineRepo;
    public MachineServiceImpl(MachineRepo machineRepo)
    {
        this.machineRepo = machineRepo;
    }
    @Override
    public void save() {
        if(machineRepo!=null)
        {
            machineRepo.save();
        }
    }

    @Override
    public int update() {
        if(machineRepo!=null)
        {
            int upadted = machineRepo.update();
            return upadted;
        }
        return 0;
    }

    @Override
    public int delete() {
        if(machineRepo!=null)
        {
            int deleted = machineRepo.delete();
            return deleted;
        }
        return 0;
    }

    @Override
    public int read() {
        if(machineRepo!=null)
        {
            int read = machineRepo.read();
            return read;
        }
        return 0;
    }
}
