package com.automobile;
import com.automobile.*;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public abstract class Vehicle {
    public abstract String getModelName();
    public abstract  String getRegistrationNumber();
    public abstract String getOwnerName();
}
class Test{
    public static void main(String[] args) {
        Hero obj1 = new Hero();
        Honda obj2 = new Honda();
        System.out.println(obj1.getModelName());
        System.out.println(obj1.getOwnerName());
        System.out.println(obj1.getRegistrationNumber());
        System.out.println(obj1.getSpeed());
        obj1.radio();
        System.out.println("...................................................");
        System.out.println(obj2.getModelName());
        System.out.println(obj2.getOwnerName());
        System.out.println(obj2.getRegistrationNumber());
        System.out.println(obj2.getSpeed());
        obj2.cdplayer();
    }

}