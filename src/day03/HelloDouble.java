package day03;

public class HelloDouble {
    public static void main(String[] args) {

        double a = 5.0, b, c, d; //unelegant
        b = 3.0;
        c = 7.0;
        d = a / c;

        System.out.println(d);

        int var1 = 3;
        int var2 = 5;

        double var3=var1/var2; // 0.0 weil er zuerst ganze Zahlen teilt und *.0 ergänzt

        System.out.println(var3);

    }
}
