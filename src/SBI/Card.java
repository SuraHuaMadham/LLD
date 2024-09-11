package SBI;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    static int PIN_NUMBER = 1234;
    private BankAccount bankAccount;

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBankBalance(){
        return bankAccount.balance;
    }
    public boolean isCorrectPin(int pin){
        return pin == PIN_NUMBER;
    }
    public void deductBalance(int bal){
        bankAccount.withdrawBalance(bal);
    }
}
