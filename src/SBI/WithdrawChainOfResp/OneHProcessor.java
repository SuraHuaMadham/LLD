package SBI.WithdrawChainOfResp;

import SBI.ATM;

public class OneHProcessor extends CashWithdrawProcessor {

    public OneHProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void withDraw(ATM atm, int withdrawAmount) {
        int required = withdrawAmount/100;
        int balance = withdrawAmount%100;

        if(required<= atm.getNoOf100Notes()){
            atm.deductOneHundredNotes(required);
        } else if(required > atm.getNoOf100Notes()) {
            atm.deductOneHundredNotes(atm.getNoOf100Notes());
            balance = balance + (required-atm.getNoOf100Notes()) * 100;
        }
        if (balance!=0){
            System.out.println("No notes left");
        }

    }
}
