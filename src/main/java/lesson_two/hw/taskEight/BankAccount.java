package lesson_two.hw.taskEight;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract double calculateInterest();
    void deposit(double amount){
        balance += amount;
    }
    Boolean withdraw(double amount){
        if(balance >= amount){
            System.out.println("Enough money");
            return true;
        } else {
            System.out.println("Not enough money");
            return false;
        }
    }
}
