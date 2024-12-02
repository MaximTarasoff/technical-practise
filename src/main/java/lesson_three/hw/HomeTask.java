package lesson_three.hw;

import java.util.*;

public class HomeTask {
    public static void main(String[] args) {
        int[] array = new int[]{1,6,8,6,7,9,8,3,2,1,2,3,0};
        String text  = "rrrrer poloroid";
        String text2  = "{}{}{}[](){{[()]}}";
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println(sumOfArray(array));
        System.out.println(reverseString(text));
        System.out.println(checkStringWithStack(text2));
        System.out.println(cleanEvenNumbers(list));
        System.out.println(Arrays.toString(rotateArray(array, 4)));

    }

    private static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    private static List<Integer> cleanEvenNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }

        return list;
    }

    private static Boolean checkStringWithStack(String text) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[') {
                stack.push(text.charAt(i));
            } else if (text.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (text.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (text.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }

    private static int[] rotateArray(int[] array, int n) {
        int[] newArray = new int[array.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i : array) {
            queue.add(i);
        }
        for (int i = 0; i < array.length - n; i++) {
            queue.add(queue.poll());
        }

        for (int i = 0; i < array.length; i++) {
            newArray[i] = queue.poll();
        }

        return newArray;
    }
}
