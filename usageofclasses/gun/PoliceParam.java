package com.xworkz.usageofclasses.gun;

public class PoliceParam {


        public void reload(Gun gun)
        {
            System.out.println("start reload in policeparam");
            gun.fire();
            gun.display();
            System.out.println("end reload in policeparam");
        }
}
