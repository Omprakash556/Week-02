
class BankAccount {
    String accountNumber;
    double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    public void displayAccountType() {
        System.out.println("This is a General Bank Account.");
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account ");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void displayAccountType() {
        System.out.println("Checking Account ");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int depositPeriod;
    public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("Deposit Period: " + depositPeriod + " months");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("B12345", 5000);
        SavingsAccount savingsAccount = new SavingsAccount("S98765", 15000, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount("C54321", 2000, 1000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("F11223", 10000, 12);


        System.out.println("Bank Account Information:");
        bankAccount.displayAccountInfo();
        bankAccount.displayAccountType();
        System.out.println();

        System.out.println("Savings Account Information:");
        savingsAccount.displayAccountInfo();
        savingsAccount.displayAccountType();
        System.out.println();

        System.out.println("Checking Account Information:");
        checkingAccount.displayAccountInfo();
        checkingAccount.displayAccountType();
        System.out.println();

        System.out.println("Fixed Deposit Account Information:");
        fixedDepositAccount.displayAccountInfo();
        fixedDepositAccount.displayAccountType();
    }
}

