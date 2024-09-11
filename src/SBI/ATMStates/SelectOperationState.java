package SBI.ATMStates;
import SBI.ATM;
import SBI.Card;
import SBI.Transaction;

import static SBI.Transaction.CASH_WITHDRAWAL;

public class SelectOperationState extends ATMState {
    public SelectOperationState(){
        showOperations();
    }
    private void showOperations(){
        System.out.println("Please select the Operation");
        Transaction.showAllTransaction();
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

    @Override
    public void selectOperation(ATM atm, Card card, Transaction txnType){

       switch ((txnType)){
           case CASH_WITHDRAWAL :
               atm.setAtmState(new CashWithdrawalState());
               break;
           case BALANCE_CHECK:
               atm.setAtmState(new CheckBalanceState());
               break;
           default:
               System.out.println("Invalid");
               exit(atm);
       }
    }


}
