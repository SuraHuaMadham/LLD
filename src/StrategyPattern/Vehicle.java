package StrategyPattern;

import StrategyPattern.Interface.DriveStrategy;

public class Vehicle {
    DriveStrategy obj;
    // Constructor Injection
    public Vehicle(DriveStrategy obj) {
        this.obj = obj;
    }
    public void drive(){
        obj.drive();
    }
}
