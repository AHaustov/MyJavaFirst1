package day02.hw2;

public class HomeWork01 {
    public static void main(String[] args) {
        int squareSide = 15;
        square(squareSide);
        perimeter(squareSide);
    }

    public static void square(int a) {
        System.out.print("Fläche eines Quadrates:" + a * a);
        System.out.println("m²");
    }

    public static void perimeter(int a) {
        System.out.print("Umfang eines Quadrates:" +4 * a);
        System.out.println("m");
    }
}
