package lesson_one.hw.base_operation;
/*
 * Запросите у пользователя два числа и выведите результат их деления и остаток от деления.
 * */


import java.util.Scanner;

public class TaskThree {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        float numberOne = sc.nextFloat();
        float numberTwo = secondNumberCreating();

        divResultsOfBox(numberOne, numberTwo);
    }

    private static void divResultsOfBox(float numberOne, float numberTwo) {
        System.out.println("Результат их деления = " + (numberOne / numberTwo));
        System.out.println("Остаток от деления = " + (numberOne % numberTwo));
    }

    private static float secondNumberCreating() {
        System.out.print("Введите второе число: ");
        float num2 = sc.nextFloat();
        while (num2 == 0) {
            System.out.println("Значение не может быть ноль");
            System.out.print("Введите второе число: ");
            num2 = sc.nextFloat();
        }
        return num2;
    }

}
