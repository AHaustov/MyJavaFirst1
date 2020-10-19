package day30;

import day20.FillAndPrint;

public class Bubblesort {
    public static void main(String[] args) {
        int[] array = new int[]{100, 45, 1, 38, 56, 75};
        //  FillAndPrint.myPrintIntArray(bubblesortRecursion(array));
        bubblesort(array);
        FillAndPrint.myPrintIntArray(array);
    }

    private static void bubblesort(int[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    private static void bubblesortRecursion(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int temp;
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubblesortRecursion(arr);
        }
    }
}
