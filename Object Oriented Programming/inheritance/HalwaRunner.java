package com.xworkz.inheritance;

import com.xworkz.inheritance.objects.BadamHalwa;
import com.xworkz.inheritance.objects.Halwa;

public class HalwaRunner {
    public static void main(String[] args) {


        Halwa halwa = new Halwa();
        halwa.taste="normal Sugar";
        System.out.println("parent class taste :"+halwa.taste);
        halwa.startingCost=30;
        System.out.println("Base price :"+halwa.startingCost);
        halwa.eat();
        halwa.material();

        System.out.println("++++++++++++++++++++++++++++++++++");

        Halwa halwa1 = new BadamHalwa();
        halwa1.taste="badami";
        System.out.println("child class taste: "+halwa1.taste);
        halwa1.startingCost=50;
        System.out.println("Badami cost: "+halwa1.startingCost);
        halwa1.eat();
        halwa1.material();

    }
}
