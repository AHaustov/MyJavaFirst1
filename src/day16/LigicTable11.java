package day16;

public class LigicTable11 {
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10)); //→ false
        System.out.println(lessBy10(11, 1, 7));// → true

        System.out.println(redTicket(2, 2, 2));// → 10
        System.out.println(redTicket(2, 2, 1));// → 0
        System.out.println(redTicket(0, 0, 0));// → 5
    }

    private static int redTicket(int a, int b, int c) {
        int result = 0;
        if (a == 2 && b == 2 && c == 2) {
            result = 10;
        } else if (a == b && b == c) {
            result = 5;
        } else if (b != a && c != a) {
            result = 1;
        }
        return result;
    }


    private static boolean lessBy10(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);
        int bc = Math.abs(b - c);
        return ab >= 10 || ac >= 10 || bc >= 10;
    }
}
