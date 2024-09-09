package Elevator;

import java.util.PriorityQueue;

import static Elevator.ElevatorLift.direction;

public class ElevatorController {
    PriorityQueue<Integer> upQ;
    PriorityQueue<Integer> downQ;
    ElevatorLift elevatorLift;

    public ElevatorController(ElevatorLift elevatorLift) {
        this.elevatorLift = elevatorLift;
        upQ = new PriorityQueue<>();
        downQ = new PriorityQueue<>((a,b)-> b-a);
    }

    public void submitExternalReq(int floor, Direction direction){
        if(direction == Direction.UP){
            upQ.offer(floor);
        }else {
            downQ.offer(floor);
        }

    }
    public void submitInternalRequest(int floor){
        if(direction == Direction.UP){
            upQ.offer(floor);
        }else {
            downQ.offer(floor);
        }

    }
    public void controlElevator() {
        while (true) {

            if (direction == Direction.UP) {

            }
        }
    }
    }
