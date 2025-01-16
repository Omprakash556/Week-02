package Level2;
public class BankAccount {
    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account details
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Getter methods (optional, if you want to access details like account holder or number)
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Main method to test the BankAccount functionality
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("John Doe", "1234567890", 1000.00);

        // Display initial balance
        account.displayBalance();

        // Deposit money
        account.deposit(500.00);
        account.displayBalance();

        // Withdraw money
        account.withdraw(200.00);
        account.displayBalance();

        // Attempt to withdraw more than available balance
        account.withdraw(1500.00);
        account.displayBalance();
    }

}
