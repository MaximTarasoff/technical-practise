package lesson_one.hw.tasks_for;

import java.util.HashSet;
import java.util.Scanner;
/*
* Пользователь вводит число N. Выведите все чётные числа от 1 до N.
* */
public class TaskFive {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        System.out.print("Чётные числа: ");
        for (Integer set : getAllEvenNumber(num)){
            System.out.print(set + " ");
        }
        sc.close();
    }

    private static HashSet<Integer> getAllEvenNumber(int num) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        return set;
    }
}
