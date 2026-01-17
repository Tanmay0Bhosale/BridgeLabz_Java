package ConstructorsAndInstances.Level2;

// Represents a bank account
public class BankAccount {

    // Public account number (accessible everywhere)
    public int accountNumber;

    // Protected account holder name (accessible in subclasses)
    protected String accountHolder;

    // Private balance (accessible only inside this class)
    private double balance;

    // Initializes bank account details
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Returns the current account balance
    public double getBalance() {
        return balance;
    }

    // Updates the account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount {

    // Initializes savings account using parent constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Displays accessible account details
    public void displayDetails() {
        System.out.println(
                "Account No: " + accountNumber +
                        ", Holder: " + accountHolder
        );
    }
}
