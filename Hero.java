package com.automobile.twowheeler;

import com.automobile.Vehicle;

import java.util.Scanner;

public class Hero extends Vehicle {
    @Override
    public String getModelName() {
        String s1  = "Hero";
        return s1;
    }
    @Override
    public String getRegistrationNumber() {
        String s2 = "Reg no. : 1234567890";
        return s2;
    }
    @Override
    public String getOwnerName() {
        String s3 = "Hero MotoCorp";
        return s3;
    }
    public int getSpeed(){
        int speed = 67;
        return speed;
    }
    public void radio(){
        Scanner s = new Scanner(System.in);
        boolean b = s.hasNextBoolean();
    }
}
