package lesson_one.hw.conditional;

/*
 * Пользователь вводит номер месяца (1-12).
 * Выведите название соответствующего времени года, используя switch.
 * */

import java.util.Scanner;

public class TaskThree {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер месяца от 1 до 12: ");
        int num = sc.nextInt();

        System.out.println("Результат: " + getSeasonByMonthNumber(num));
        sc.close();
    }

    private static String getSeasonByMonthNumber(int num) {
        return switch (num) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> throw new IllegalArgumentException("Введен некорректный номер месяца");
        };
    }
}
