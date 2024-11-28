package lesson_two.hw.taskEight;

public class SavingsAccount extends BankAccount {
    double fivePercentByYear = 23;
    @Override
    double calculateInterest() {
        setBalance(getBalance() + fivePercentByYear);
        return getBalance();
    }
}
