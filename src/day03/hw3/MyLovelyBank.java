package day03.hw3;

public class MyLovelyBank {
    public static void main(String[] args) {


        bankAccount(1000,7, 3.5);

    }

    private static void bankAccount(double money, int year, double interest) {
        double result = interest*year*money/100 +money;
        System.out.println(result);
    }
}
