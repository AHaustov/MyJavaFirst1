package day03;

public class HelloPi {
    public static void main(String[] args) {
        double pi = 3.14;
        double r = 5.5;

        System.out.println(pi * r * r);

        final double PI2 = 3.14;
        pi = pi + 1;
        System.out.println(pi); //Fließkommafehler

        // PI2 = PI2 + 1; nicht möglich; durch final ist PI2 immer fest; final wird immer Groß geschrieben
        double var1 = 1_000_000.0;
        // 1,0E+6

        double pi3 = Math.PI;
        double var2 = Math.pow(2, 3);

        System.out.println(var2);
    }
}
