package lesson_one.hw.conditional;

import java.util.Scanner;

/*
* Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.
* */
public class TaskFive {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        System.out.println("Результат: " + isNumDivBy3And5(num));
        sc.close();
    }

    private static String isNumDivBy3And5(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "Делится на 3 и 5";
        }
        return "Не делится на 3 и 5";
    }
}
