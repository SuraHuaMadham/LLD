package SBI.WithdrawChainOfResp;

import SBI.ATM;

public class FiveHProcessor extends CashWithdrawProcessor{
    public FiveHProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void withDraw(ATM atm, int withdrawAmount) {
        int required = withdrawAmount/500;
        int balance = withdrawAmount%500;

        if(required<= atm.getNoOf500Notes()){
            atm.deductFiveHundredNotes(required);
        } else if(required > atm.getNoOf500Notes()) {
            atm.deductFiveHundredNotes(atm.getNoOf500Notes());
            balance = balance + (required-atm.getNoOf500Notes()) * 500;
        }
        if (balance!=0){
            super.withDraw(atm,balance);
        }else{
            return;
        }

    }
}
