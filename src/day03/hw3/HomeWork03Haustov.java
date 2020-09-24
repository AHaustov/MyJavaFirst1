package day03.hw3;

import java.text.DecimalFormat;

/*
    1.Написать программу для вычисления площади круга.
    2.Найти длину окружности.
    3.Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
    4.Найти соотношение площади Беларуси к площади Украины.
    5.Найти, во сколько раз площадь Москвы больше площади Берлина.
    6.Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
*/
public abstract class HomeWork03Haustov {


    public static void main(String[] args) {

        double radius = 4.2;
        double PI = Math.PI;
        double euro = 10.0;

        double areaBelarus = 207_595.0;
        double areaUkraine = 603_628.0;
        double areaMoscow=2_511.0;
        double areaBerlin=891.8;
        double accValue= 1_000.0;
        double interests= 3.5;
        int years=7;

        starteAufgabe1(radius, PI);
        starteAufgabe2(radius, PI);
        starteAufgabe3(euro);
        starteAufgabe4(areaBelarus,areaUkraine);
        starteAufgabe5(areaMoscow,areaBerlin);
        starteAufgabe6(accValue,interests,years); //im Unterricht haben Sie den ZinsesZins wohl bewusst weggelassen.

    }

    private static void starteAufgabe6(double accValue, double interest, int years) {

        double factorYear =(1+ interest /100);
        double result= accValue *Math.pow(factorYear, years);
        DecimalFormat f = new DecimalFormat("#0.00");

        System.out.println("Nach "+ years +" sollten bei einem Zinssatz von "+ interest +" "+f.format(result)+"€ auf dem Konto sein.");
    }

    private static void starteAufgabe5(double a, double b) {

        double result=a/b;
        DecimalFormat f = new DecimalFormat("#0.00");

        System.out.println("Die Fläche von Berlin passt "+f.format(result)+"x in die Fläche Moskau.");
    }

    private static void starteAufgabe4(double a,double b) {

        double result=b/a;
        DecimalFormat f = new DecimalFormat("#0.00");

        System.out.println("Die Fläche von Weißrussland passt "+f.format(result)+"x in die Fläche der Ukraine.");
    }

    private static void starteAufgabe3(double euro) {

        double dollar = euro * 1.1;

        System.out.println(euro + "€ sind " + dollar + "$ wert.");
    }

    private static void starteAufgabe2(double radius, double pi) {

        System.out.println("Der Umfang eines Kreises mit dem Radius " + radius + " beträgt: " + 2 * pi * radius);
    }

    private static void starteAufgabe1(double radius, double PI) {

        System.out.println("Die Fläche eines Kreises mit dem Radius " + radius + " beträgt: " + PI * radius * radius);
    }

}
