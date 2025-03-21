package oops_;

// Example: Encapsulation in Java
class BankAccount {
    // Private data members (data hiding)
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Public getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Public setter method to deposit money (encapsulation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public setter method to withdraw money (encapsulation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

// Main class to demonstrate encapsulation
public class Main {
    public static void main(String[] args) {
        // Create an object of BankAccount
        BankAccount account = new BankAccount("John Doe", 1000.0);

        // Accessing and modifying data using methods
        System.out.println("Account Balance: " + account.getBalance());
        account.deposit(500.0);   // Deposit money
        account.withdraw(300.0); // Withdraw money

        // Trying to access private data directly (Not allowed)
        // account.balance = 2000.0; // This will cause a compile-time error
    }
}
