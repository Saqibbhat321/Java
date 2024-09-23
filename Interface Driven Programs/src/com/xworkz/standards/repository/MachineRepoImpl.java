package com.xworkz.standards.repository;

public class MachineRepoImpl implements MachineRepo{


    @Override
    public void save() {
        System.out.println("this is save method in machine repo");
    }

    @Override
    public int update() {
        return 1;
    }

    @Override
    public int delete() {
        return 1;
    }

    @Override
    public int read() {
        return 1;
    }
}
