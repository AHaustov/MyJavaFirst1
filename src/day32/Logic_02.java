package day32;

public class Logic_02 {
    public static void main(String[] args) {
        /*System.out.println(makeChocolate(4, 1, 9));// → 4
        System.out.println(makeChocolate(4, 1, 10));// → -1
        System.out.println(makeChocolate(4, 1, 7));// → 2
        System.out.println(makeChocolate(5, 2, 15));// → 5
        System.out.println(makeChocolate(10, 1, 15));// → 10*/
        /*System.out.println(closeFar(1, 2, 10));// → true
        System.out.println(closeFar(1, 2, 3));// → false
        System.out.println(closeFar(4, 1, 3));// → true*/
        System.out.println(luckySum(1, 2, 3));// → 6
        System.out.println(luckySum(1, 2, 13));// → 3
        System.out.println(luckySum(1, 13, 3));// → 1

    }

    private static int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13) sum = 0;
        if (b == 13) sum = a;
        if (c == 13) sum = a + b;
        return sum;
    }

    private static boolean closeFar(int a, int b, int c) {
        boolean diffa = Math.abs(a - b) <= 1 || Math.abs(a - c) <= 1;
        boolean diffb = Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2;
        boolean diffc = Math.abs(c - a) >= 2 && Math.abs(b - c) >= 2;
        return diffa && (diffb || diffc);
    }

    private static int makeChocolate(int smallBars, int bigBars, int goal) {
        int result = goal;
        for (int i = 0; i < bigBars; i++) {
            if (result >= 0) {
                result -= 5;
            }
        }
        return result <= smallBars ? result : -1;
    }
}
