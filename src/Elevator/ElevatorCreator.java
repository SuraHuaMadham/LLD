package Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static{
        ElevatorLift e1 = new ElevatorLift();
        e1.id=1;
        ElevatorController e1c = new ElevatorController(e1);

        ElevatorLift e2 = new ElevatorLift();
        e2.id=1;
        ElevatorController e2c = new ElevatorController(e1);

        elevatorControllerList.add(e1c);
        elevatorControllerList.add(e2c);
    }
}
