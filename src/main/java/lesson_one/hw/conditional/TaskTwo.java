package lesson_one.hw.conditional;

/*
 *Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.
 * */

import java.util.Scanner;

public class TaskTwo {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        float num1 = sc.nextFloat();
        System.out.println("Введите оператор: ");
        String operator = sc.next();
        float num2 = secondNumberCreating();

        System.out.println("Результат: " + calc(num1, operator, num2));
        sc.close();
    }

    private static float calc(float num1, String operator, float num2) {
        float result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Ошибка ввода оператора");
        }
        return result;
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
