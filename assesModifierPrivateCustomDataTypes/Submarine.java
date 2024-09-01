package com.xworkz.assesModifierPrivateCustomDataTypes;

import java.nio.file.FileStore;
import java.util.jar.JarOutputStream;

public class Submarine {



        private boolean isSubmerged;
        private int totalTorpedos;
        private int torpedosFired;
        private String type;
        private double depth;
        private boolean hasSonar;
        private boolean isStealthy;
        private boolean isArmed;
        private String countryOfOrigin;
        private boolean isUnderRepair;


        public Submarine(boolean isSubmerged, int totalTorpedos,int torpedosFired,String type,double depth)
        {
            this.depth = depth;
            this.isSubmerged = isSubmerged;
            this.torpedosFired = torpedosFired;
            this.torpedosFired = totalTorpedos;
            this.type =type;
        }

        public void setHasSonar(boolean hasSonar)
        {
            this.hasSonar = hasSonar;
        }
        public void setStealthy(boolean isStealthy)
        {
            this.isStealthy = isStealthy;
        }
        public void setArmed(boolean isArmed)
        {
            this.isArmed = isArmed;
        }
        public void setCountryOfOrigin(String countryOfOrigin)
        {
            this.countryOfOrigin = countryOfOrigin;
        }

        public void setUnderRepair(boolean isUnderRepair)
        {
            this.isUnderRepair = isUnderRepair;
        }


        public void submarineDetails()
        {
            System.out.println("type: "+this.type);
            System.out.println("is submerged: "+this.isSubmerged);
            System.out.println("total torpedos: "+this.totalTorpedos);
            System.out.println("torpedos fired: "+this.torpedosFired);
            System.out.println("depth: "+this.depth);
            System.out.println("has sonar: "+this.hasSonar);
            System.out.println("is stealthy: "+this.isStealthy);
            System.out.println("is armed: "+this.isArmed);
            System.out.println("country origin: "+this.countryOfOrigin);
            System.out.println("is under repair"+this.isUnderRepair);
        }

}
