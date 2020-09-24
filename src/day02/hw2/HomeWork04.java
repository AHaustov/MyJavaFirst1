package day02.hw2;

import java.math.BigInteger;

public class HomeWork04 {
    public static void main(String[] args) {
        int SeitenLängeSpielBrett = 8;
        AnzahlFelder(SeitenLängeSpielBrett);

       BigInteger Körner;
        Körner = new BigInteger("2");
        int exponent = SeitenLängeSpielBrett*SeitenLängeSpielBrett;
        BigInteger Abzug;
        Abzug = new BigInteger("1");


        BigInteger result = Körner.pow(exponent);
        BigInteger Anzahl = result.subtract(Abzug);


        System.out.println("Es sind " + Anzahl + " Körner auf dem Schachbrett.");
    }

    public static void AnzahlFelder(int a) {
        int AnzahlFelder = a * a;
        System.out.print("Es sind " + AnzahlFelder);
        System.out.println(" Felder auf dem Spielbrett");
    }


  /*  BigInteger AnzahlKörner;
    AnzahlKörner =new

    BigInteger("2");

    int exponent = 65;
    BigInteger result = AnzahlKörner.pow(exponent);
    System.out.println("Result of pow operation between BigInteger "
        +AnzahlKörner +" and exponent "+exponent +" equal to "+result);*/

     /*   BigInteger Körner = new BigInteger("1");
        int AnzahlFelder = a * a;{
        Körner = Körner.pow(2 AnzahlFelder );}
        System.out.println(Körner.toString());
    }*/

  /* public static void AnzahlKörner(int a){
        long AnzahlKörner=0B1111111111111111111111111111111111111111111111111111111111111111L;
        System.out.print("Es sind "+ AnzahlKörner);
        System.out.println(" Körner auf dem Spielbrett");


    }*/
}
