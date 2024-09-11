package SBI;

import java.util.Scanner;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();
        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm,atmRoom.user.card);
        System.out.println("Enter PIN");
        int pin = sc.nextInt();
        atmRoom.atm.getAtmState().authenticatePin(atmRoom.atm,atmRoom.user.card,pin);
        //Pin is 1234
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm,atmRoom.user.card,Transaction.CASH_WITHDRAWAL);
        System.out.println("Enter Amount");
        int amt = sc.nextInt();
        atmRoom.atm.getAtmState().cashWithdrawal(atmRoom.atm,atmRoom.user.card,amt);
        atmRoom.atm.printCurrentATMStatus();

    }

    private void initialize() {

        atm = ATM.getAtm();
        atm.setAtmBalance(4000,1,5,3);
        this.user = createUser();

    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private BankAccount createBankAccount() {
        BankAccount account = new BankAccount();
        account.balance = 2700;
        return account;
    }

}
