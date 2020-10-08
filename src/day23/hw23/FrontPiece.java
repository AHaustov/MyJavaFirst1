package day23.hw23;

import day20.FillAndPrint;

public class FrontPiece {
    public static void main(String[] args) {
        int[] front1 = new int[]{1, 2, 3};
        int[] front2 = new int[]{1, 2};
        int[] front3 = new int[]{1};
        FillAndPrint.myPrintIntArray(frontPiece(front1));// → [1, 2]
        FillAndPrint.myPrintIntArray(frontPiece(front2));// → [1, 2]
        FillAndPrint.myPrintIntArray(frontPiece(front3));// → [1]
    }
private static int getMeSizeOutput2(int[]front){
        return front.length>2?2: front.length;
}
    private static int[] frontPiece(int[] front) {
        int[]output=new int[getMeSizeOutput2(front)];
        for (int i = 0; i < output.length; i++) {
            output[i]=front[i];
        }
        return output;
    }
}
