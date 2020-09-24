package day04;

public class DoubleReview {

    public static void main(String[] args) {

        double pi = Math.PI;

        System.out.println(pi);

        // myLovlyRound(pi);
        // myNotLovlyRound();
        roundNumber3();


    }

    private static void roundNumber3() {
        double pi = Math.PI;
        double pi2 = Math.floor(pi); //nach unten gerundet
        double pi3 = Math.ceil(pi);  //nach oben gerundet
        System.out.println(pi);
        System.out.println(pi2);
        System.out.println(pi3);

        double pi4= Math.round(pi);  //mathematisch gerundet
        System.out.println(pi4);

    }
    private static void myNotLovlyRound() {
        double pi = Math.PI;
        double newNumber1 = (int) (Math.round(pi * 100) / 100);
        System.out.println(newNumber1);
        //return Math.round(value * scale) / scale


    }

    private static void myLovlyRound(double number) {

        double result = 0.0;
        int k = 100;
        double temp = number * k;

        System.out.println(temp);
        int temp2 = (int) temp;
        System.out.println(temp2);
        result = temp2;
        result = result / k;
        System.out.println(result);
    }
}
