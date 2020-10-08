package day23.hw23;

import day20.FillAndPrint;

public class FrontOfTwoArray {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1};
        int[] a3 = new int[]{1, 7};
        int[] b1 = new int[]{7, 9, 8};
        int[] b2 = new int[]{2};
        int[] b3 = new int[]{};

        FillAndPrint.myPrintIntArray(front11(a1, b1));//  → [1, 7]
        FillAndPrint.myPrintIntArray(front11(a2, b2));// → [1, 2]
        FillAndPrint.myPrintIntArray(front11(a3, b3));//→ [1]
    }

    private static boolean isEmptyIntArray(int[] arr) {
        return !(arr.length > 0);
    }

    private static int getNotEmptyIntArray(int[] arr1, int[] arr2) {
        if (!isEmptyIntArray(arr1) && !isEmptyIntArray(arr2)) {
            return 2;
        } else if (!isEmptyIntArray(arr1) ^ !isEmptyIntArray(arr2)) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int[] front11(int[] a1, int[] b1) {
        int[] output = new int[getNotEmptyIntArray(a1, b1)];
        if (!isEmptyIntArray(a1) && output.length > 0) {
            output[0] = a1[0];
        }
        if (!isEmptyIntArray(b1) && output.length > 0) {
            output[output.length - 1] = b1[0];
        }
        return output;
    }
}
