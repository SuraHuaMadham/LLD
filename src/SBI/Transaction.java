package SBI;

public enum Transaction {
    CASH_WITHDRAWAL,
    BALANCE_CHECK;

    public static void showAllTransaction() {
        for (Transaction type : Transaction.values()) {
            System.out.println(type.name());
        }
    }
}
