package IncapsulationAndPolymorphism.bankingmgmtsystem;

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Concrete method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();

    // Getter methods for encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Interface Loanable
interface Loanable {
    void applyForLoan(double loanAmount);
    boolean calculateLoanEligibility();
}

// SavingsAccount class extending BankAccount and implementing Loanable
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.05;  // 5% interest for savings accounts

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;  // Interest for savings account
    }

    @Override
    public void applyForLoan(double loanAmount) {
        if (loanAmount <= getBalance() * 5) {
            System.out.println("Loan of " + loanAmount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan application rejected for " + getHolderName());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;  // Eligible for loan if balance is more than $5000
    }
}

// CurrentAccount class extending BankAccount and implementing Loanable
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02;  // 2% interest for current accounts

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;  // Interest for current account
    }

    @Override
    public void applyForLoan(double loanAmount) {
        if (loanAmount <= getBalance() * 3) {
            System.out.println("Loan of " + loanAmount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan application rejected for " + getHolderName());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 2000;  // Eligible for loan if balance is more than $2000
    }
}

// Main class to test the Banking System
public class BankingSystem {
    public static void main(String[] args) {
        // Creating account objects
        BankAccount savingsAccount = new SavingsAccount("SA123", "Om Prakash", 10000);
        BankAccount currentAccount = new CurrentAccount("CA456", "Anubhav", 3000);

        // Depositing and withdrawing money from the accounts
        savingsAccount.deposit(500);
        currentAccount.withdraw(1000);

        // Demonstrating polymorphism: Calculating interest dynamically
        BankAccount[] accounts = {savingsAccount, currentAccount};
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("Interest: " + account.calculateInterest());

            // Checking loan eligibility and applying for loan if eligible
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                if (loanableAccount.calculateLoanEligibility()) {
                    loanableAccount.applyForLoan(2000);
                } else {
                    System.out.println(account.getHolderName() + " is not eligible for a loan.");
                }
            }
            System.out.println();  // Blank line between accounts
        }
    }
}
