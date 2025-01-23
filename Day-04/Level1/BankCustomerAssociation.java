
// Aggregation Example

import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

     Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(String customerName, double initialBalance) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            customer = new Customer(customerName, this);
            customers.add(customer);
        }
        int accountNumber = customer.getAccounts().size() + 1;
        customer.addAccount(new Account(accountNumber, initialBalance));
        System.out.println("Account opened for " + customerName + " with balance " + initialBalance + ".");
    }

    public void displayCustomerDetails() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            for (Account account : customer.getAccounts()) {
                System.out.println("  Account " + account.getAccountNumber() + ", Balance: " + account.getBalance());
            }
        }
    }

    public Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {
    private String name;
    private Bank bank;
    private List<Account> accounts;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Account " + accountNumber + ", Balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankCustomerAssociation {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Global Bank");

        // Open accounts for customers
        bank.openAccount("Om Prakash", 5000);
        bank.openAccount("Deepansh", 3000);
        bank.openAccount("Prahlad", 7000);
        bank.openAccount("Om Prakash", 2000);

        // View balances for customers
        Customer omPrakash = bank.findCustomer("Om Prakash");
        if (omPrakash != null) omPrakash.viewBalance(1);
        if (omPrakash != null) omPrakash.viewBalance(2);

        Customer deepansh = bank.findCustomer("Deepansh");
        if (deepansh != null) deepansh.viewBalance(1);

        // Display all customer details
        bank.displayCustomerDetails();
    }
}

