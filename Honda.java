package com.automobile.twowheeler;

import com.automobile.Vehicle;

import java.util.Scanner;

public class Honda extends Vehicle {
    @Override
    public String getModelName() {
        String s1  = "Honda";
        return s1;
    }
    @Override
    public String getRegistrationNumber() {
        String s2 = "Reg no. : 123456789";
        return s2 ;
    }
    @Override
    public String getOwnerName() {
        String s3 = "Hero MotoCorp";
        return s3;
    }
    public int getSpeed(){
        int speed=56;
        return speed;
    }
    public void cdplayer(){
        Scanner  s = new Scanner(System.in);
        boolean b = s.hasNextBoolean();
    }

}

