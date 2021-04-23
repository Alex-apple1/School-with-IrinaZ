package PracticeStanA.bank_account;

import PracticeStanA.bank_account.BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.setAccountBalance(150.15);

        BankAccount b = new BankAccount();
        b.setAccountBalance(380.75);

        BankAccount.setInterstRate(3.75);

        System.out.println("First acc. balance: $" +a.getAccountBalance());
        System.out.println("Second acc. balance: $" + b.getAccountBalance());
        System.out.println("Interest rate: " + BankAccount.getInterstRate());

        BankAccount.setInterstRate(5.95);
        System.out.println("Interest rate: " + BankAccount.getInterstRate());
    }
}
