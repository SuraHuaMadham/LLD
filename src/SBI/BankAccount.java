package SBI;

public class BankAccount {
    public int balance;

    public void withdrawBalance(int bal){
        balance = balance - bal;
    }
}
