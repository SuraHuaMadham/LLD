package SBI.WithdrawChainOfResp;

import SBI.ATM;

public class TwoKProcessor extends CashWithdrawProcessor{

    public TwoKProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void withDraw(ATM atm, int withdrawAmount) {
        int required = withdrawAmount/2000;
        int balance = withdrawAmount%2000;

        if(required<= atm.getNoOf2kNotes()){
            atm.deductTwoThousandNotes(required);
        } else if(required > atm.getNoOf2kNotes()) {
            atm.deductTwoThousandNotes(atm.getNoOf2kNotes());
            balance = balance + (required-atm.getNoOf2kNotes()) * 2000;
        }
        if (balance!=0){
            super.withDraw(atm,balance);
        }else{
            return;
        }

    }
}
