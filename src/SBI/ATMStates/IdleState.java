package SBI.ATMStates;

import SBI.ATM;
import SBI.Card;

public class IdleState extends ATMState {
    @Override
    public  void insertCard(ATM atm, Card card){
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());

    }

}
