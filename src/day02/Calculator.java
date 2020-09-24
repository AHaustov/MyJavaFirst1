package day02;

public class Calculator {


    public static void main(String[] args) {

        int a = 5;
        int b = 11;

        Addition(a,b);
        Multiplikation(a,b);
    }

    public static void Multiplikation( int a,int b) {
       /* int a = 5;
        int b = 10;*/
        System.out.println("Was ist a*b? -" + (a * b));
    }

    public static void Addition(int a, int b) {
        /*int a = 5;
        int b = 10;*/
        System.out.println("Was ist a+b? -" + (a + b));
    }

    public static void intIntroduction() {
        //   System.out.println(2*5);
        int a = 2;
        int b = 6;
        int c = a + b;
        System.out.println("Wie viel ist c? -" + c);
        int money = 900;
        int iphoneCost = 1000;
        System.out.println("Anzahl von IPhone -" + money / iphoneCost);

    }
}
