package lesson_one.hw.tasks_for;

import lesson_one.les.Factorial;

import java.util.Scanner;

/*
 * Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).
 * */
public class TaskFour {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        System.out.println("Факториал: " + getFactorial(num));
        sc.close();
    }

    public static int getFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
