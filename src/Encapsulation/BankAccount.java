package Encapsulation;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0)
            balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}