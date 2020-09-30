package day17;

import java.util.Scanner;

public class NewThemaScanner {
    public static void main(String[] args) {
        //myPrint();
        myScanner();
    }

    private static void myScanner() {
        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("How old are you?");
        old = input.nextInt();
        if (old < 18) {
            System.out.println("Get your parents here");
        } else {
            System.out.println("Please enter");
        }
        input.close();
    }

    private static void myPrint() {
        System.out.println();
        System.out.print("");
        System.out.printf("");
    }
}
