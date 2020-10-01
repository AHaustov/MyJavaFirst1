package day18;

public class ClassWork18 {
    public static void main(String[] args) {
         //1.Finde die Öberflächen der Figuren
         //2.Addiere die Flächen
         //3.Entscheide dich für eine geeignete Einheit
         //4.Finde die benötigte Menge der Farbe
        //5.Finde die Anzahl der Farbdosen
        //6.Finde die Höhe der Kosten
        int price400 = 17;
        myLovelyRedColor(price400);

    }

    private static double pythagoras(int a, int b) {
        return Math.sqrt(a * a - b * b / 4);
    }

    private static double ball(int r) {
        return Math.PI * r * r * 4;
    }

    private static double pyramide(int ground, int side) {
        return ground * ground + 2 * ground * pythagoras(20, 30);
    }

    private static int cube(int r) {
        return 6 * r * r;
    }

    private static int quader(int a, int b, int c) {
        return 2 * (a * b + a * c + b * c);
    }

    private static double square() {
        return quader(80, 30, 20) + cube(40)
                + ball(58) + pyramide(30, 20);
    }

    private static void myLovelyRedColor(int prize) {
        int color = (int) (square() * 560 / 10000);
        double cost = color / 400 * prize;

    }
}
