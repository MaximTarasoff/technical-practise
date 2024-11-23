package lesson_one.hw.inner_cycle;

import java.util.Scanner;

/*
 * Реализуйте программу, которая выводит пирамиду из звёздочек высотой N.
 * */
public class TaskThree {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите N: ");
        int n = sc.nextInt();

        getPyramidByN(n);
        sc.close();
    }

    private static void getPyramidByN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Ошибка ввода данных");
        }
        int starCount = 1;
        int mid = n;
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < mid; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            starCount += 2;
            mid--;
        }
    }

}
