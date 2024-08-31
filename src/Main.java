import StrategyPattern.NormalVehicle;
import StrategyPattern.SportsVehicle;
import StrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new NormalVehicle();
        v.drive();
        Vehicle v2 = new SportsVehicle();
        v2.drive();
    }
}