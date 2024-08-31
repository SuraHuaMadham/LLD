package StrategyPattern;

import StrategyPattern.Interface.NormalStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalStrategy());
    }
}
