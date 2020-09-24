package day11;

import day12.Split;

public class hw11 {
    public static void main(String[] args) {

        split(1);

        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));// → 21
        split(2);
        System.out.println(in1To10(5, false));// → true
        System.out.println(in1To10(11, false));// → false
        System.out.println(in1To10(11, true));// → true
        Split.Task(3);
        System.out.println(old35(3));// → true
        System.out.println(old35(10));// → true
        System.out.println(old35(15));// → false
    }

    private static void split(int a) {
        System.out.println("\n" + "Task" + a + "\n" + "------------------------------------" + "\n");
    }

    private static boolean old35(int age) {
        return age % 3 == 0 ^ age % 5 == 0;
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        if (1 <= n && n <= 10 && !outsideMode) {
            return true;
        } else return (n <= 1 ^ n >= 10) && outsideMode;
    }

    private static int sortaSum(int a, int b) {
        if (a + b < 10) {
            return a + b;
        } else return Math.max(a + b, 20);
    }
}
