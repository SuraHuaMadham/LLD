package SBI.ATMStates;

import SBI.ATM;
import SBI.Card;
import SBI.WithdrawChainOfResp.CashWithdrawProcessor;
import SBI.WithdrawChainOfResp.FiveHProcessor;
import SBI.WithdrawChainOfResp.OneHProcessor;
import SBI.WithdrawChainOfResp.TwoKProcessor;

public class CashWithdrawalState extends ATMState{
    public CashWithdrawalState() {
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount){
       if(atm.getAtmBalance()<withdrawAmount){
           System.out.println("Insufficient fund in the ATM Machine");
           exit(atm);
       }else if(card.getBankBalance()<withdrawAmount){
           System.out.println("Insufficient fund in your account. Please get rich first!");
           exit(atm);
       }else{
           card.deductBalance(withdrawAmount);
           atm.deductATMBalance(withdrawAmount);
           CashWithdrawProcessor withdrawProcessor = new TwoKProcessor(new FiveHProcessor(new OneHProcessor(null)));
           withdrawProcessor.withDraw(atm,withdrawAmount);
           exit(atm);
       }
    }

    @Override
    public void exit(ATM atmObject){
        returnCard();
        atmObject.setAtmState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }
}
