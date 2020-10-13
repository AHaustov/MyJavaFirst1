package day25;

public class Exercise19 {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 1, 2, 3, 4};
        int[] a2 = new int[]{2, 2, 0};
        int[] a3 = new int[]{1, 3, 5};
        System.out.println(countEvens(a1));// → 3
        System.out.println(countEvens(a2));// → 3
        System.out.println(countEvens(a3));// → 0
    }

    private static int countEvens(int[] even) {
        int output = 0;
        for (int i : even) {
            if (i % 2 == 0) {
                output ++;
            }
        }
        return output;
    }
}
