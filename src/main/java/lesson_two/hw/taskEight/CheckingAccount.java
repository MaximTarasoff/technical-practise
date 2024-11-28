package lesson_two.hw.taskEight;

public class CheckingAccount extends BankAccount {

    @Override
    double calculateInterest() {
        return getBalance();
    }
}
