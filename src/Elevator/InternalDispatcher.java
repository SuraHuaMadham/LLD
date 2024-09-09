package Elevator;


import java.util.List;

public class InternalDispatcher {
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submit(int destination, ElevatorLift elevatorLift) {
    }
}
