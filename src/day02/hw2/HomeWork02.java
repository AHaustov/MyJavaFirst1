package day02.hw2;

public class HomeWork02 {
    public static void main(String[] args) {
        int RechtEckSeite1 = 4;
        int RechtEckSeite2 = 7;
        System.out.print("Seitenlänge a des Rechtecks :" + RechtEckSeite1);
        System.out.println("m");
        System.out.print("Seitenlänge b des Rechtecks :" + RechtEckSeite2);
        System.out.println("m");
        RechteckUmfang(RechtEckSeite1, RechtEckSeite2);
        RechteckFläche(RechtEckSeite1, RechtEckSeite2);

    }

    public static void RechteckUmfang(int a, int b) {
        System.out.print("Umfang des Rechtecks:" + 2 * (a + b));
        System.out.println("m");

    }

    public static void RechteckFläche(int a, int b) {
        System.out.print("Fläche des Rechtecks:" + a * b);
        System.out.println("m²");

    }
}
