package SBI.ATMStates;

import SBI.ATM;
import SBI.Card;

public class HasCardState extends ATMState{
    public HasCardState() {

    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isPin = card.isCorrectPin(pin);
        if(isPin){
            atm.setAtmState(new SelectOperationState());
        }else{
            System.out.println("Invalid PIN Number");
            exit(atm);
        }

    }
    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

}
