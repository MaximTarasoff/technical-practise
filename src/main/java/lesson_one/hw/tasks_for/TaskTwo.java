package lesson_one.hw.tasks_for;

import java.util.Scanner;

/*
 * Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
 * */
public class TaskTwo {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите N: ");
        int num = sc.nextInt();

        System.out.println("Сумма: " + getSumToN(num));
        sc.close();
    }

    private static int getSumToN(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
