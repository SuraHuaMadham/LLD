package SBI.WithdrawChainOfResp;

import SBI.ATM;

public abstract class CashWithdrawProcessor {
    CashWithdrawProcessor nextProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void withDraw(ATM atm, int withdrawAmount) {
        if(nextProcessor!=null){
            nextProcessor.withDraw(atm,withdrawAmount);
        }
    }
}
