package day06.hw6;

public class hw6 {

    // Aufgabe 8 und 12
    public static void main(String[] args) {

        System.out.println("Aufgabe 8");
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));

        split();

        System.out.println("Aufgabe 10");

        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
    //    System.out.println(extraFront("H"));
    }

    private static String extraFront(String s1) {

        int end = s1.length() ;
        String newS1 = s1.substring(0, 2);
        String result = newS1 + newS1 + newS1;

        return result;
    }

    private static String lastChars(String s1, String s2) {

        String newS2 = "@" + s2;
        String result = s1.substring(0, 1) + newS2.substring(s2.length());

        return result;
    }

    public static void split() {
        System.out.println("--------------------------");

    }
}
