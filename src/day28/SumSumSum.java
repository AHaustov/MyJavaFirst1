package day28;

public class SumSumSum {
    public static void main(String[] args) {
        System.out.println(sumSimple(3, 6));
        System.out.println(sumNotSimple(1, 2, 3));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumArray(arr));
        System.out.println(myNewSum(1, 2, 3, 4, 5, 4, 2, 5));
    }

    private static int myNewSum(int... args) {
        int result = 0;
        for (int element : args
        ) {
            result += element;
        }
        return result;
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    private static int sumNotSimple(int a, int b, int c) {
        return a + b + c;
    }

    private static int sumSimple(int a, int b) {
        return a + b;
    }
}
