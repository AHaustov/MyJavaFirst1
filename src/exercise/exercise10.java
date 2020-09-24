package exercise;

import day12.Split;

public class exercise10 {
    public static void main(String[] args) {

        Split.Task(1);
        System.out.println(sleepIn(false, false)); //→ true
        System.out.println(sleepIn(true, false)); //→ false
        System.out.println(sleepIn(false, true));// → true
        Split.Task(2);
        System.out.println(diff21(19)); //→ 2
        System.out.println(diff21(10)); //→ 11
        System.out.println(diff21(21));//→ 0
        Split.Task(3);
        System.out.println(nearHundred(93)); //→ true
        System.out.println(nearHundred(90)); //→ true
        System.out.println(nearHundred(89));// → false
        Split.Task(4);
        
    }

    private static Boolean nearHundred(int n) {
        return 10>=Math.abs(n-100)||10>=Math.abs(n-200);
    }

    private static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else return 2 * Math.abs(21 - n);

    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    private static void split(int a) {
        System.out.println('\n' + "Task" + a + "\n" + "--------------------------------");
    }
}
