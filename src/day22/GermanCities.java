package day22;

import java.util.Arrays;

public class GermanCities {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        String[] myCities = new String[]
                {
                        "Berlin",
                        "München",
                        "Dresden",
                        "Hamburg",
                        "Potsdam"
                };

        System.out.println(Arrays.toString(myCities));
        myPrintStringArray(myCities);
        myPrintForI(myCities);
    }

    private static void myPrintForI(String[] myCities) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        System.out.print("[ ");
        for (int i = 0; i < myCities.length - 1; i++) {
            System.out.print(i % 2 == 0 ? ANSI_GREEN : ANSI_RED);
            System.out.print(myCities[i] + ", " + ANSI_RESET);
        }
        System.out.print(myCities.length % 2 == 1 ? ANSI_GREEN : ANSI_RED);
        System.out.print(myCities[myCities.length - 1] + ANSI_RESET);
        System.out.println(" ]");
    }

    private static void myPrintStringArray(String[] input) {
        System.out.print("[ ");
        for (String element : input) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }
}
