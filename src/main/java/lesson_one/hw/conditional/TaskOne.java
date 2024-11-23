package lesson_one.hw.conditional;

import java.util.Scanner;

/*
 * Напишите программу, которая проверяет, является ли число чётным или нечётным.
 * */
public class TaskOne {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        isNumberEvenOrOdd(num);
        sc.close();
    }

    private static void isNumberEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Результат: Чётное");
        } else {
            System.out.println("Результат: Нечётное");
        }
    }
}
