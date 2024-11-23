package lesson_one.hw.base_operation;

/*
 * Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.
 * */

import java.util.Scanner;

public class TaskTwo {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Длина: ");
        float numberOne = sc.nextFloat();

        System.out.println("Ширина: ");
        float numberTwo = sc.nextFloat();

        System.out.println("Площадь: " + squareOfBox(numberOne, numberTwo));
    }

    private static float squareOfBox(float numberOne, float numberTwo) {
        return numberOne * numberTwo;
    }
}
