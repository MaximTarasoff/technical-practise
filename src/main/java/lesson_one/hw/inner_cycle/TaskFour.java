package lesson_one.hw.inner_cycle;

import java.util.HashSet;
import java.util.Scanner;

/*
 * Найдите все простые числа от 2 до N.
 * Используйте вложенные циклы для проверки делимости.
 * */

public class TaskFour {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите N: ");
        int n = sc.nextInt();

        for (Integer num: getSimpleNumbers(n)){
            System.out.print(num + " ");
        }
        sc.close();
    }

    private static HashSet<Integer> getSimpleNumbers(int n) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        set.add(2);
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 1) {
                set.add(i);
            }
            count = 0;
        }
        return set;
    }
}
