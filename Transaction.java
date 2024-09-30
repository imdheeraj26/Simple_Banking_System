package banking;

class Transaction {
    String type;
    double amount;
    double balanceAfter;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    public void displayTransaction() {
        System.out.println(type + ": $" + amount + " | Balance after: $" + balanceAfter);
    }
}
