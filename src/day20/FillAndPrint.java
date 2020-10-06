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
        System.out.print("[ ");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println(input[input.length - 1] + " ]");
    }

    private static void fillArray(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
        }
    }
}
