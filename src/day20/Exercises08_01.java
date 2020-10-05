package day20;

public class Exercises08_01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min;
        int max;
        int middle;
        int sum;
        System.out.println(average(arr));
        System.out.println(minimal(arr));
        System.out.println(maximal(arr));
    }

    private static double average(int[] input) {
        double average = summary(input);
        average /= input.length;
        return average;
    }

    private static int summary(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        return sum;
    }

    private static int maximal(int[] input) {
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

    private static int minimal(int[] input) {
        int min = input[0];
        for (int i = 0; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
        }
        return min;
    }
}
