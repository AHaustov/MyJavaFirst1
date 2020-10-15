package day28;

import day20.FillAndPrint;

public class Excersice18 {
    public static void main(String[] args) {
       /* System.out.println(unlucky1(1, 3, 4, 5));// → true
        System.out.println(unlucky1(2, 1, 3, 4, 5));// → true
        System.out.println(unlucky1(1, 1, 1));// → false*/
       /* System.out.println(sameFirstLast(1, 2, 3));// → false
        System.out.println(sameFirstLast(1, 2, 3, 1));// → true
        System.out.println(sameFirstLast(1, 2, 1));// → true*/
       /* FillAndPrint.myPrintIntArray(maxEnd3(1, 2, 3));// → [3, 3, 3]
        FillAndPrint.myPrintIntArray(maxEnd3(11, 5, 9)); //→ [11, 11, 11]
        FillAndPrint.myPrintIntArray(maxEnd3(2, 11, 3));// → [3, 3, 3]*/
        /*FillAndPrint.myPrintIntArray(makeEnds(1, 2, 3));// → [1, 3]
        FillAndPrint.myPrintIntArray(makeEnds(1, 2, 3, 4)); //→ [1, 4]
        FillAndPrint.myPrintIntArray(makeEnds(7, 4, 6, 2));// → [7, 2]
*/
        /*int[] a1 = {1, 2, 3};
        int[] a2 = {7, 2, 3};
        int[] a3 = {1, 2};
        int[] b1 = {1, 3};
        int[] b2 = {1};
        int[] b3 = {};
        System.out.println(start1(a1, b1));// → 2
        System.out.println(start1(a2, b2));// → 1
        System.out.println(start1(a3, b3));// → 1*/
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3, 4};
        int[] b1 = {4, 5, 6};
        int[] b2 = {5, 6};
       /* FillAndPrint.myPrintIntArray(sumOne(a1, b1));//  -> [1,2,3,4,5,6]
        FillAndPrint.myPrintIntArray(sumOne(a2, b2));// ->[1,2,3,4,5,6]*/
        FillAndPrint.myPrintIntArray(sumTwo(a1, b1));//  -> [5,7,9]
        FillAndPrint.myPrintIntArray(sumTwo(a2, b2));//  -> [6,8,3,4]

    }

    private static int[] sumTwo(int[] a, int[] b) {
        int[] output = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i < b.length) {
                output[i] = a[i] + b[i];
            } else {
                output[i] = a[i];
            }
        }
        return output;
    }

    private static int[] sumOne(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            output[a.length + i] = b[i];
        }
        return output;
    }

    private static int start1(int[] a, int[] b) {
        int output = 0;
        if (a.length > 0 && a[0] == 1) {
            output++;
        }
        if (b.length > 0 && b[0] == 1) {
            output++;
        }
        return output;
    }

    private static int[] makeLast(int... args) {
        int[] output = new int[2 * args.length];
        output[output.length - 1] = args[args.length - 1];
        return output;
    }

    private static int[] makeEnds(int... args) {
        int[] output = new int[]{args[0], args[args.length - 1]};
        return output;
    }

    private static int[] maxEnd3(int... args) {
        int[] output = new int[3];
        int max = Math.max(args[0], args[2]);
        for (int i = 0; i < 3; i++) {
            output[i] = max;
        }
        return output;
    }

    private static boolean sameFirstLast(int... args) {
        return args.length > 1 && args[0] == args[args.length - 1];
    }

    private static boolean unlucky1(int... args) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] == 1 && args[i + 1] == 3 &&
                    (i < 2 || args.length - i < 2)) {
                return true;
            }
        }
        return false;
    }
}
