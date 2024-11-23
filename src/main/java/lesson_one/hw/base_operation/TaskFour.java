package lesson_one.hw.base_operation;

/*Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
Формула: F = C * 9/5 + 32.
Пример:
Copy code
Введите температуру в Цельсиях: 25
Температура в Фаренгейтах: 77
*/

import java.util.Scanner;

public class TaskFour {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите температуру в Цельсиях: ");
        float numberOne = sc.nextFloat();
        System.out.println("Температура в Фаренгейтах: " + getFarByCel(numberOne));
    }

    private static float getFarByCel(float value) {
        return value * 9/5 + 32;
    }
}
