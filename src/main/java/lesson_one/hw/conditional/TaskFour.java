package lesson_one.hw.conditional;

import java.util.Scanner;

/*
* Напишите программу, которая определяет категорию человека по возрасту:
0-12: Ребёнок
13-17: Подросток
18-64: Взрослый
65+: Пенсионер.

* */
public class TaskFour {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();

        System.out.println("Результат: " + getStatus(age));
        sc.close();
    }

    private static String getStatus(int age) {
        if (age < 13 && age >= 0) {
            return "Ребёнок";
        } else if (age < 18 && age >= 0) {
            return "Подросток";
        } else if (age < 65 && age >= 0) {
            return "Взрослый";
        } else if (age > 64) {
            return "Пенсионер";
        } else {
            throw new IllegalArgumentException("Ошибка ввода данных");
        }
    }

}
