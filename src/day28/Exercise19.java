package day28;

import day20.FillAndPrint;

public class Exercise19 {
    public static void main(String[] args) {
        /*FillAndPrint.myPrintIntArray(fizzArray(4));// → [0, 1, 2, 3]
        FillAndPrint.myPrintIntArray(fizzArray(1));// → [0]
        FillAndPrint.myPrintIntArray(fizzArray(10));// → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
        System.out.println(no14(1, 2, 3));// → true
        System.out.println(no14(1, 2, 3, 4));// → false
        System.out.println(no14(2, 3, 4));// → true
    }

    private static boolean no14(int... args) {
        int countOne = 0;
        int countFour = 0;
        for (int element : args
        ) {
            if (element == 1) {
                countOne++;
            }
            if (element == 4) {
                countFour++;
            }
        }
        return !(countOne > 0 && countFour > 0);
    }

    private static int[] fizzArray(int input) {
        int[] output = new int[input];
        int count = 0;
        for (int i = 0; i < output.length; i++) {
            output[i] = count;
            count++;
        }
        return output;
    }

}
