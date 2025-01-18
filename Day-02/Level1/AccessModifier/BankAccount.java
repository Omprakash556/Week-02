
public class BankAccount {
    // Instance variables
    public String accountNumber; // Public - can be accessed from anywhere
    protected String accountHolder; // Protected - can be accessed by subclasses
    private double balance; // Private - can only be accessed within the class

    // Constructor to initialize the bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingAccount
class SavingAccount extends BankAccount {

    // Constructor to initialize saving account details
    public SavingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display saving account details
    public void displaySavingAccountDetails() {
        System.out.println("Saving Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + getBalance());
    }
}

// Main class to test the BankAccount and SavingAccount classes
 class BankAccountManagement {

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("12345", "Alice", 5000.00);
        account1.displayAccountDetails();
        System.out.println();

        // Modifying the balance using the public method
        account1.setBalance(5500.00);
        System.out.println("Updated Balance: $" + account1.getBalance());
        System.out.println();

        // Creating a SavingAccount object
        SavingAccount savingAccount1 = new SavingAccount("67890", "Bob", 2000.00);
        savingAccount1.displaySavingAccountDetails();
    }
}

