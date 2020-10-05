package day20;

public class FillAndPrint {
    public static void main(String[] args) {
        int[] source = new int[]{1, 2, 3, 4, 5};
        myPrintIntArray(source);
        int myFillElement = 100;
        fillArray(source, myFillElement);
        myPrintIntArray(source);
    }

    public static void myPrintIntArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println();
    }

    private static void fillArray(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
        }
    }
}
