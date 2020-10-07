package day22;

import day20.FillAndPrint;

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
