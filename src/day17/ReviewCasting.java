package day17;

public class ReviewCasting {


    public static void main(String[] args) {
        intToChar();
        charToInt();
    }

    private static void charToInt() {
        char c1 = 'x';
        char c2 = '\u034A';
        char c3 = 100;
        int x = c1;

    }

    private static void intToChar() {
        int x = 90;
        char c = (char) x;
        System.out.println(c);
    }
}
