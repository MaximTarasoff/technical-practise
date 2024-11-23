package lesson_one.hw.inner_cycle;

import java.util.Scanner;

/*
 * Напишите программу, которая выводит прямоугольник из звёздочек размером M x N
 *  (пользователь вводит размеры).
 * */
public class TaskTwo {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите M: ");
        int m = sc.nextInt();
        System.out.println("Введите N: ");
        int n = sc.nextInt();

        writeBoxWithStarts(m, n);
        sc.close();
    }

    private static void writeBoxWithStarts(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
