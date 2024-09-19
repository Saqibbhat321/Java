package com.xworkz.standards.addrreposerviceimpl;

import com.xworkz.standards.addressreposervice.AddressRepo;
import com.xworkz.standards.addressreposervice.AddressService;

public class AddressServiceImpl implements AddressService {

    private AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo)
    {
        this.addressRepo = addressRepo;
    }



    @Override
    public boolean push() {

        if(addressRepo!=null)
        {
            boolean saved = addressRepo.save();
            if(saved)
            {
                System.out.println("saved: "+saved);
            }
            else
                System.out.println("saved: "+saved);
        }
        return false;
    }

    @Override
    public int refresh() {

        if(addressRepo!=null)
        {
           int updatestatus = addressRepo.update();
           if(updatestatus>=1)
           {
               System.out.println("update status: "+updatestatus);
           }
           else System.out.println("update status: "+updatestatus);
        }
        return 0;
    }

    @Override
    public void remove() {

        if(addressRepo!=null)
        {
            addressRepo.delete();
            System.out.println("deleted successfully");
        }
        else System.out.println("data not deleted");
    }

    @Override
    public String load() {
        if(addressRepo!=null)
        {
            String loaded = addressRepo.read();
            return "load success";

        }
        return "load failed";
    }
}
