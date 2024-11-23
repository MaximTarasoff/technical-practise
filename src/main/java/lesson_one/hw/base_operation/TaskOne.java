package lesson_one.hw.base_operation;
/*
* Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
* */

import java.util.Scanner;

public class TaskOne {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number one: ");
        float numberOne = sc.nextFloat();

        System.out.println("Enter number two: ");
        float numberTwo = sc.nextFloat();

        System.out.println(sumOfNumbers(numberOne, numberTwo));
    }

    private static float sumOfNumbers(float numberOne, float numberTwo) {
        return numberOne + numberTwo;
    }
}
