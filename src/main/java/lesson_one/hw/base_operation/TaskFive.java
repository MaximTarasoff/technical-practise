package lesson_one.hw.base_operation;

import java.util.Scanner;

public class TaskFive {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number a: ");
        float a = sc.nextFloat();

        System.out.println("Enter number b: ");
        float b = sc.nextFloat();
        System.out.println("До обмена: a =" + a + ", b = " + b);

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("До обмена: a = " + a + ", b = " + b);
    }
}
