package lesson_two.hw.taskEight;

public class CheckEightTask {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new SavingsAccount();
        accounts[1] = new CheckingAccount();
        accounts[2] = new SavingsAccount();

        accounts[0].deposit(1000);
        accounts[1].deposit(2000);
        accounts[2].deposit(3000);

        for (BankAccount account : accounts) {
            System.out.println("Проверка начисления: " + account.calculateInterest());
        }
    }
}
