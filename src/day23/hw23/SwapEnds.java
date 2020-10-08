package day23.hw23;

import day20.FillAndPrint;

public class SwapEnds {
    public static void main(String[] args) {
        int[] end1 = new int[]{1, 2, 3, 4};
        int[] end2 = new int[]{1, 2, 3};
        int[] end3 = new int[]{8, 6, 7, 9, 5};
        FillAndPrint.myPrintIntArray(swapEnds(end1));// → [4, 2, 3, 1]
        FillAndPrint.myPrintIntArray(swapEnds(end2));// → [3, 2, 1]
        FillAndPrint.myPrintIntArray(swapEnds(end3));// → [5, 6, 7, 9, 8]
    }

    private static int[] swapEnds(int[] end) {
        int[] output = new int[end.length];
        output[0] = end[end.length - 1];
        for (int i = 1; i < end.length - 1; i++) {
            output[i] = end[i];
        }
        output[end.length - 1] = end[0];
        return output;
    }
}
