package classandobjects.level2;

/**
 * The BankAccount class represents a bank account with holder name, account number, and balance.
 * It provides methods to deposit money, withdraw money (with balance check), and display the current balance.
 */
public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Method to deposit a specified amount into the account
    void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw a specified amount if sufficient balance is available
    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    // Method to display the current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Ravi";
        acc.accountNumber = 12345;
        acc.balance = 5000;

        acc.deposit(2000);
        acc.withdraw(1000);
        acc.displayBalance();
    }
}
