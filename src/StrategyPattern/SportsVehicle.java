package StrategyPattern;

import StrategyPattern.Interface.SportsStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsStrategy());
    }
}
