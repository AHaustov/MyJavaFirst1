package day02;

public class AnotherJavaClass {

    public static void main(String[] args) {
        getMeCoffee();
    }

    public static void getMeCoffee() {
        System.out.println("Rezept für Kaffee:");
        getMeWaterToCoffee();
        getMeCoffeeToCoffee();
    }

    public static void getMeWaterToCoffee() {
        System.out.println("-50ml Wasser zugeben.");
    }

    public static void getMeCoffeeToCoffee() {
        System.out.println("-5g Kaffee zugeben.");
    }
}
