package banking;

import java.util.ArrayList;

class Account {
    private double balance;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private String pin;

    public Account(String pin) {
        this.balance = 0.0;
        this.pin = pin;
    }

    public boolean authenticate(String inputPin) {
        return pin.equals(inputPin);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount, balance));
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount, balance));
            System.out.println("Withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void calculateInterest(double rate) {
        double interest = balance * (rate / 100);
        balance += interest;
        transactions.add(new Transaction("Interest", interest, balance));
        System.out.println("Interest of $" + interest + " added to your balance.");
    }

    public void displayTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("\nTransaction History:");
            for (Transaction transaction : transactions) {
                transaction.displayTransaction();
            }
        }
    }
}
