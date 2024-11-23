package lesson_one.hw.inner_cycle;

import java.util.Scanner;

/*Выведите шахматную доску размером N x N, где клетки чередуются символами # и .
 * */
public class TaskFive {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите N: ");
        int n = sc.nextInt();

        getDesk(n);
        sc.close();
    }

    private static void getDesk(int n) {
        String desk = "#";
        for (int i = 0; i < n; i++) {
            System.out.print(desk);

            for (int j = 1; j < n; j++) {
                if (desk.equals("#")) {
                    desk = ".";
                    System.out.print(desk);
                } else {
                    desk = "#";
                    System.out.print(desk);
                }
            }
            System.out.println();
        }
    }
}
