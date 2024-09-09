package Elevator;

public class ElevatorLift {
    int id;
    InternalButton internalButton;
    ElevatorState elevatorState;
    int currentFloor;
    static Direction direction;
    ElevatorDoor elevatorDoor;
    ElevatorDisplay elevatorDisplay;

    public ElevatorLift() {
        elevatorDisplay = new ElevatorDisplay();
        internalButton = new InternalButton();
        elevatorState = ElevatorState.Idle;
        direction = Direction.UP;
        elevatorDoor = new ElevatorDoor();
        currentFloor = 0;
    }

    public void showDisplay(){
        elevatorDisplay.showDisplay();
    }

    public void setDisplay(){
        this.elevatorDisplay.setDisplay(currentFloor,direction);
    }
}
