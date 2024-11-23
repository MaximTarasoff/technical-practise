package lesson_one.hw.inner_cycle;

import java.util.Scanner;

/*
* Выведите таблицу умножения от 1 до 10 в формате:
* */
public class TaskOne {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
