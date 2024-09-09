package Elevator;

public class InternalButton {
    InternalDispatcher internalDispatcher = new InternalDispatcher();

    int []availButtons = {0,1,2,3,4,5};
    int buttonSelected;

    void pressButton(int destination,ElevatorLift elevatorLift){
        //1.check if destination is in the list of available floors

        //2.submit the request to the jobDispatcher
        internalDispatcher.submit(destination,elevatorLift);
    }

}
