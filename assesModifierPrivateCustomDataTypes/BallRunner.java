package com.xworkz.assesModifierPrivateCustomDataTypes;

public class BallRunner {

    public static void main(String[] args) {

        Ball ball1 = new Ball(true,true,true,false, true,true,true,false);
        Ball ball2 = new Ball(false,false,true,true, true,false,true,true);
        Ball ball3 = new Ball(true,true,false,false, false,true,false,true);


        ball1.setBouncy(true);
        ball1.setBrand("Voltex");
        ball1.setColor("grey");
        ball1.setDeflated(false);
        ball1.setDiameter(35);
        ball1.setFlat(false);
        ball1.setHasLogo(true);
        ball1.setInflatable(true);
        ball1.setMaterial("plastic");
        ball1.setNumPanels(23);
        ball1.setWeight(500);
        ball1.setWaterproof(true);
        ball1.setPumped(true);
        ball1.setOfficialSize(true);

        ball2.setBouncy(true);
        ball2.setBrand("Cruise");
        ball2.setColor("Purple");
        ball2.setDeflated(false);
        ball2.setDiameter(26);
        ball2.setFlat(true);
        ball2.setHasLogo(true);
        ball2.setInflatable(false);
        ball2.setMaterial("Leather");
        ball2.setNumPanels(79);
        ball2.setWeight(680);
        ball2.setWaterproof(true);
        ball2.setPumped(false);
        ball2.setOfficialSize(true);
        ball3.setBouncy(false);
        ball3.setBrand("Monty & Jonty");
        ball3.setColor("White");
        ball3.setDeflated(true);
        ball3.setDiameter(75);
        ball3.setFlat(true);
        ball3.setHasLogo(false);
        ball3.setInflatable(false);
        ball3.setMaterial("Rexene");
        ball3.setNumPanels(3);
        ball3.setWeight(800);
        ball3.setWaterproof(true);
        ball3.setPumped(false);
        ball3.setOfficialSize(false);

        Ball[] ballarr = new Ball[3];
        ballarr[0] = ball1;
        ballarr[1] = ball2;
        ballarr[2] = ball3;


        for(int i = 0;i< ballarr.length;i++)
        {
            Ball ref = ballarr[i];
            ref.ballDetails();
            System.out.println("+++++++++=++++++++++++++++++++++++++++++++++++++++++++");
        }
    }

}
