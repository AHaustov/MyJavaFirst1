package day11;

public class day11 {
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));// → 1
        System.out.println(teaParty(3, 8));// → 0
        System.out.println(teaParty(20, 6));// → 2

        System.out.println(twoAsOne(1, 2, 3));// → true
        System.out.println(twoAsOne(3, 1, 2));// → true
        System.out.println(twoAsOne(3, 2, 2));// → false

        System.out.println(lastDigit(23, 19, 13)); //→ true
        System.out.println(lastDigit(23, 19, 12)); //→ false
        System.out.println(lastDigit(23, 19, 3));//→ true

        System.out.println(maxMod5(2, 3)); //→ 3
        System.out.println(maxMod5(6, 2)); //→ 6
        System.out.println(maxMod5(3, 2));// → 3

        System.out.println(blueTicket(9, 1, 0));// → 10
        System.out.println(blueTicket(9, 2, 0));// → 0
        System.out.println(blueTicket(6, 1, 4));// → 10

        System.out.println(dateFashion(5, 10)); //→ 2
        System.out.println(dateFashion(5, 2)); //→ 0
        System.out.println(dateFashion(5, 5)); //→ 1

    }

    private static int dateFashion(int you, int date) {
        if (Math.min(you, date) <= 2) {
            return 0;
        } else if (Math.max(you, date) >= 8) {
            return 2;
        } else return 1;
    }

    private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab - bc == 10 || ab - ac == 10) {
            return 5;
        } else return 0;
    }

    private static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a, b);
        } else return Math.max(a, b);

    }

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    private static boolean twoAsOne(int a, int b, int c) {

        return a == b + c || b == a + c || c == a + b;
    }

    private static int teaParty(int tea, int candy) {
        if ((tea >= 5 && candy >= 5) && ((tea >= 2 * candy) || (candy >= 2 * tea))) {
            return 2;
        } else if (tea >= 5 && candy >= 5) {
            return 1;
        } else return 0;
    }
}
