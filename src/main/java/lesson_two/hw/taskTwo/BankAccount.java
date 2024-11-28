package lesson_two.hw.taskTwo;

public class BankAccount {
    private int accountNumber;
    private double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance < amount) {
            throw new RuntimeException("Insufficient balance");
        }
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}
