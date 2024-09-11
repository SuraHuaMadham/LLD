package SBI;

import SBI.ATMStates.ATMState;
import SBI.ATMStates.IdleState;

public class ATM {
    private static ATM atm = new ATM(); //Singleton: eager initialization
    ATMState atmState;

    private int atmBalance;
    int noOf2kNotes;
    int noOf500Notes;
    int noOf100Notes;

    private ATM(){}

    public void setAtmBalance(int atmBalance, int noOf2kNotes, int noOf100Notes, int noOf500Notes) {
        this.noOf2kNotes = noOf2kNotes;
        this.noOf100Notes = noOf100Notes;
        this.noOf500Notes = noOf500Notes;
        this.atmBalance = atmBalance;
    }

    public static ATM getAtm() {
        atm.setAtmState(new IdleState());
        return atm;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }


    public int getNoOf2kNotes() {
        return noOf2kNotes;
    }

    public int getNoOf500Notes() {
        return noOf500Notes;
    }

    public int getNoOf100Notes() {
        return noOf100Notes;
    }

    public void deductTwoThousandNotes(int number) {
        noOf2kNotes = noOf2kNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOf500Notes = noOf500Notes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOf100Notes = noOf100Notes - number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOf2kNotes);
        System.out.println("500Notes: " + noOf500Notes);
        System.out.println("100Notes: " + noOf100Notes);

    }


}
