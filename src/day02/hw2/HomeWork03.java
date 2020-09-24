package day02.hw2;

public class HomeWork03 {
    public static void main(String[] args) {
        int Seitenlänge = 3;
        System.out.print("Seitenlänge des Würfels:" + Seitenlänge);
        System.out.println("m");
        UmfangWürfel(Seitenlänge);
        FlächeWürfel(Seitenlänge);
        VolumenWürfel(Seitenlänge);
    }

    public static void FlächeWürfel(int a) {
        System.out.print("Fläche des Würfels:" + 6*(a * a));
        System.out.println("m²");
    }

    public static void UmfangWürfel(int a) {
        System.out.print("Umfang des Würfels:" + 12*a);
        System.out.println("m");
    }

    public static void VolumenWürfel(int a) {
        System.out.print("Volumen des Würfels:" + a*a * a);
        System.out.println("m³");
    }
}
