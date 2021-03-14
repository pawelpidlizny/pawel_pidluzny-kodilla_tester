package kodilla.bank.homework;

public class Bank {
    CashMachine atm1;
    CashMachine atm2;

    public int totalBalance(CashMachine atm1, CashMachine atm2) {
        int TotalBalance = atm1.balance() + atm2.balance();
        return TotalBalance;
    }

    public int inTransactionCount(CashMachine atm1, CashMachine atm2) {
        int TotalInTransactionCount = atm1.inValuesCount() + atm2.inValuesCount();
        return TotalInTransactionCount;
    }

    public int outTransactionsCount(CashMachine atm1, CashMachine atm2) {
        int TotalOutTransactionCount = atm1.outValuesCount() + atm2.outValuesCount();

        return TotalOutTransactionCount;
    }

    public double totalAverageIn(CashMachine atm1, CashMachine atm2) {
        double TotalAverageIn = (atm1.inValueSum() + atm2.inValueSum()) / (atm1.inValuesCount() + atm2.inValuesCount());

        return TotalAverageIn;
    }

    public double totalAverageOut(CashMachine atm1, CashMachine atm2) {
        double TotalAverageOut = (atm1.outValueSum() + atm2.outValueSum()) / (atm1.outValuesCount() + atm2.outValuesCount());

        return TotalAverageOut;
    }
}
