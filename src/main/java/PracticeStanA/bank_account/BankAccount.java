package PracticeStanA.bank_account;

public class BankAccount {
    double accountBalance;
    static double interstRate;

    public static double getInterstRate() {
        return interstRate;
    }

    public static void setInterstRate(double interstRate) {
        BankAccount.interstRate = interstRate;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
