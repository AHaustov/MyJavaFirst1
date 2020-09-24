package training;

public class Training {

    public static void main(String[] args) {
        double a = 5;
        double b = 9;
        double c = 6;
        test(a);
        test2(a, b, c);
        test3(b, c);
    }

    private static void test3(double b, double c) {
        double d = b % c;
        System.out.println(d);
    }

    private static void test2(double a, double b, double c) {
        double r = ((a++) * b)%(c);
        System.out.println(r);

    }

    private static void test(double a) {
        a++;
        System.out.println(a);
    }
}
