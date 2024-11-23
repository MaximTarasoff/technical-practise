package lesson_one.hw.tasks_for;

import java.util.Scanner;

/*
 * Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
 * */
public class TaskThree {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        getMultTable(num);
        sc.close();
    }

    private static void getMultTable(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + i * num);
        }
    }
}
