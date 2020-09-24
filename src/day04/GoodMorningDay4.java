package day04;

public class GoodMorningDay4 {

    public static void main(String[] args) {

        // double PI = Math.PI;
        double radius = 4;

        getAreaCircle(radius);
        findCircumference(radius);
        findCircumference(7);
        findCircumference(10);
        int radiusFromConstantin = 100;
        findCircumference(radiusFromConstantin);

        double moneyInEuro = 1000;
        double rateEuroDollar = 1.1;

        currencyConverter(moneyInEuro, rateEuroDollar);
    }

    private static void currencyConverter(double euro, double course) {
        //d=euro*1,1

        System.out.println(euro * course);
    }

    private static void findCircumference(double radius) {
        //L= 2*pi*r
        System.out.println(2 * Math.PI * radius);
    }


    private static void getAreaCircle(double b) {

        System.out.println(Math.PI * b * b);
    }
}
