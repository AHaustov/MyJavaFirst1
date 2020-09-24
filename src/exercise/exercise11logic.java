package exercise;

import day12.Split;

public class exercise11logic {
    public static void main(String[] args) {

        Split.Task(12);
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));// → 21
        Split.Task(13);
        System.out.println(in1To10(5, false));// → true
        System.out.println(in1To10(11, false));// → false
        System.out.println(in1To10(11, true));// → true
        Split.Task(14);
        System.out.println(old35(3));// → true
        System.out.println(old35(10));// → true
        System.out.println(old35(15));// → false
        Split.Task(15);
        System.out.println(teenSum(3, 4));// → 7
        System.out.println(teenSum(10, 13));// → 19
        System.out.println(teenSum(13, 2));// → 19
        Split.Task(16);
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"
    }

    private static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }else if(str.startsWith("f")){
            return "Fizz";
        }else if (str.endsWith("b")){
            return "Buzz";
        }else{
            return str;
        }
    }

    private static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }

    private static void split(int a) {
        System.out.println("\n" + "Task" + a + "\n" + "------------------------------------" + "\n");
    }

    private static boolean old35(int age) {
        return age % 3 == 0 ^ age % 5 == 0;
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        if (1 <= n && n <= 10 && !outsideMode) {
            return true;
        } else return (n <= 1 ^ n >= 10) && outsideMode;
    }

    private static int sortaSum(int a, int b) {
        if (a + b < 10) {
            return a + b;
        } else return Math.max(a + b, 20);
    }
}
