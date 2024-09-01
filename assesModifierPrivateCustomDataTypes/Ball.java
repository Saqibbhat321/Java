package com.xworkz.assesModifierPrivateCustomDataTypes;

public class Ball {



        private String color;
        private double diameter;
        private double weight;
        private boolean isBouncy;
        private boolean isInflatable;
        private boolean isIndoor;
        private boolean isOutdoor;
        private boolean isWaterproof;
        private boolean isOfficialSize;
        private int numPanels;
        private String material;
        private String brand;
        private boolean hasLogo;
        private boolean isInMotion;
        private boolean isDeflated;
        private boolean isPumped;
        private boolean isFlat;
        private boolean isSpinning;
        private boolean isGrippy;
        private boolean isLightUp;
        private boolean glowsInTheDark;
        private boolean isSigned;
        private boolean isCollectible;
        private boolean isCustomized;
        private boolean isRegulation;

        public Ball(boolean isRegulation, boolean isCustomized, boolean isCollectible, boolean isSigned, boolean glowsInTheDark
        ,boolean isLightUp,boolean isGrippy,boolean isSpinning)
        {
            this.glowsInTheDark = glowsInTheDark;
            this.isRegulation = isRegulation;
            this.isCollectible = isCollectible;
            this.isSpinning = isSpinning;
            this.isCustomized = isCustomized;
            this.isSigned= isSigned;
            this.isGrippy = isGrippy;
            this.isLightUp = isLightUp;
        }

        public void setColor(String color)
        {
            this.color = color;
        }
        public void setDiameter(double diameter)
        {
            this.diameter = diameter;

        }
        public  void setWeight(double weight)
        {
            this.weight = weight;
        }
        public void setBouncy(boolean isBouncy)
        {
            this.isBouncy = isBouncy;
        }
        public void setInflatable(boolean isInflatable)
        {
            this.isInflatable = isInflatable;

        }

        public void setOutdoor(boolean isOutdoor)
        {
            this.isOutdoor = isOutdoor;
        }

        public void setIndoor(boolean isIndoor)
        {
            this.isIndoor = isIndoor;
        }
        public void setWaterproof(boolean isWaterproof)
        {
            this.isWaterproof = isWaterproof;
        }
        public void setOfficialSize(boolean isOfficialSize)
        {
            this.isOfficialSize = isOfficialSize;

        }
        public void setNumPanels(int numPanels)
        {
            this.numPanels = numPanels;
        }

        public void setMaterial(String material)
        {
            this.material = material;
        }
        public void setBrand(String brand)
        {
            this.brand = brand;

        }
        public void setHasLogo(boolean hasLogo)
        {
            this.hasLogo = hasLogo;

        }
        public void setInMotion(boolean isInMotion)
        {
            this.isInMotion = isInMotion;
        }
        public void setDeflated(boolean isDeflated)
        {
            this.isDeflated = isDeflated;

        }
        public void setPumped(boolean isPumped)
        {
            this.isPumped = isPumped;
        }
        public void setFlat(boolean isFlat)
        {
            this.isFlat = isFlat;
        }

        public void ballDetails()
        {
            System.out.println("color :"+this.color);
            System.out.println("diamete: "+this.diameter);
            System.out.println("weight: "+this.weight);
            System.out.println("is bouncy"+this.isBouncy);
            System.out.println("is inflatable: "+this.isInflatable);
            System.out.println("is indoor: "+this.isIndoor);
            System.out.println("is outdoor: "+this.isOutdoor);
            System.out.println("is waterproof: "+isWaterproof);
            System.out.println("is official size: "+isOfficialSize);
            System.out.println("num of panels: "+numPanels);
            System.out.println("materail of ball: "+material);
            System.out.println("brand: "+this.brand);
            System.out.println("has logo: "+hasLogo);
            System.out.println("is in motion: "+isInMotion);
            System.out.println("is deflated: "+isDeflated);
            System.out.println("is pumped: "+isPumped);
            System.out.println("is flat: "+this.isFlat);
            System.out.println("is spinning: "+isSpinning);
            System.out.println("is grippy: "+isGrippy);
            System.out.println("is lightup: "+isLightUp);
            System.out.println("glows in dark: "+this.glowsInTheDark);
            System.out.println("is signed: "+this.isSigned);
            System.out.println("is collectible: "+this.isCollectible);
            System.out.println("is Refulation"+isRegulation);
        }
}

