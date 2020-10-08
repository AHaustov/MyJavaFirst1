package day22;

import day20.FillAndPrint;

import static day07.ClassWorkBoolean.split;

public class Exercise18_01 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 6};
        int[] arr2 = new int[]{6, 1, 2, 3};
        int[] arr3 = new int[]{13, 6, 1, 2, 3};
       /* System.out.println(firstLast6(arr1));// →true
        System.out.println(firstLast6(arr2));// →true
        System.out.println(firstLast6(arr3));// →false*/
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{7, 3};
        int[] arr6 = new int[]{7, 3, 2};
        int[] arr7 = new int[]{1, 3};
        /*System.out.println(commonEnd(arr4, arr5));// → true
        System.out.println(commonEnd(arr4, arr6));// → false
        System.out.println(commonEnd(arr3, arr7));// → true*/
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};

        FillAndPrint.myPrintIntArray(reverse3(a1));// → [3, 2, 1]
        FillAndPrint.myPrintIntArray(reverse3(a2));// → [9, 11, 5]
        FillAndPrint.myPrintIntArray(reverse3(a3));// → [0, 0, 7]
        split();
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{7, 7, 7};
        int[] b3 = new int[]{5, 2, 9};
        int[] c1 = new int[]{4, 5, 6};
        int[] c2 = new int[]{3, 8, 0};
        int[] c3 = new int[]{1, 4, 5};
        FillAndPrint.myPrintIntArray(middleWay(b1, c1));// → [2, 5]
        FillAndPrint.myPrintIntArray(middleWay(b2, c2));// → [7, 8]
        FillAndPrint.myPrintIntArray(middleWay(b3, c3));// → [2, 4]
        split();
        int[] d1 = new int[]{4, 5};
        int[] d2 = new int[]{4, 2};
        int[] d3 = new int[]{3, 5};
        System.out.println(no23(d1));//true
        System.out.println(no23(d2));//false
        System.out.println(no23(d3));//false
        split();
        int[] f1 = new int[]{1, 2, 3};
        int[] f2 = new int[]{2, 3, 5};
        int[] f3 = new int[]{1, 2, 1};
        FillAndPrint.myPrintIntArray(fix23(f1));//→ [1, 2, 0]
        FillAndPrint.myPrintIntArray(fix23(f2)); //→ [2, 0, 5]
        FillAndPrint.myPrintIntArray(fix23(f3)); //→ [1, 2, 1]
    }

    private static int[] fix23(int[] arr) {
        int[] output = new int[arr.length];
        output[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 3 && arr[i - 1] == 2) {
                output[i] = 0;
            } else {
                output[i] = arr[i];
            }
        }
        return output;
    }

    private static boolean no23(int[] arr) {
        return arr[0] != 2 && arr[1] != 2
                && arr[0] != 3 && arr[1] != 3;
    }

    private static int[] middleWay(int[] arr1, int[] arr2) {
        int[] output = new int[2];
        output[0] = arr1[arr1.length / 2];
        output[1] = arr2[arr2.length / 2];
        return output;
    }

    private static int[] reverse3(int[] arr) {
        int[] output = new int[3];
        output[0] = arr[2];
        output[1] = arr[1];
        output[2] = arr[0];
        return output;
    }

    private static boolean commonEnd(int[] a1, int[] a2) {
        return a1[0] == a2[0] || a1[a1.length - 1] == a2[a2.length - 1];
    }

    private static boolean firstLast6(int[] number) {
        return number[0] == 6 || number[number.length - 1] == 6;
    }
}
