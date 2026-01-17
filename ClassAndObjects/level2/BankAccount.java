package oopsprogrammingfundamentals.level2;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

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
