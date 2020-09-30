package day17.hw17;

import java.util.Scanner;

public class HomeWork17 {
    public static void main(String[] args) {
        split(1);
        System.out.println(getMeMax(15, 5));// → 15
        System.out.println(getMeMax(4, 16));// → 16
        System.out.println(getMeMax(20, 100));// → 100
        split(2);
        System.out.println(getMeMin(15, 45));// → 15
        System.out.println(getMeMin(44, 16));// → 16
        System.out.println(getMeMin(200, 100));// → 100
        split(3);
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"
        split(4);
        System.out.println(aLotOf(3, 4));// ->3333
        split(5);
        allNumbers(5, 17);
        split(6);
        //whoAreU();
        split(7);
        myLovelyRiddle(10);
    }

    private static void myLovelyRiddle(int n) {
        int trys = 5;
        int secretNumber = (int) (Math.random() * n + 1);
        int usersGuess;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < trys; i++) {
            System.out.println("Nextround" + " and " + (trys - i) + " trys left.");
            usersGuess = input.nextInt();
            if (usersGuess == secretNumber) {
                System.out.println("Congratulations, you guessed right.");
                break;
            } else {
                if ((usersGuess < secretNumber)) {
                    System.out.println("Number is too low");
                } else {
                    System.out.println("number is too high");
                }
            }
            if (i == trys-1) {
                System.out.println("You lost.");
            }
        }
        input.close();
    }

    private static void whoAreU() {
        Scanner input = new Scanner(System.in);
        String fName, lName, sex, eMail;
        int age;
        System.out.println("What is your First Name?");
        fName = input.next();
        System.out.println("What is your Last Name");
        lName = input.next();
        System.out.println("What is your sex?");
        sex = input.next();
        System.out.println("How old are you?");
        age = input.nextInt();
        System.out.println("Please enter your E-Mailadress.");
        eMail = input.next();
        input.close();
    }

    private static void allNumbers(int a, int B) {
        int i = a;
        do {
            System.out.printf("%3d", i);
            i++;
        } while (i <= B);
        System.out.println();
    }

    private static String aLotOf(int a, int b) {
        int i = 0;
        String output = "";
        while (i < b) {
            output += a;
            i++;
        }
        return output;
    }

    private static String myFirstCompareTo(String city1, String city2) {
        return city1.compareTo(city2) < 0 ? city1 : city2;
    }

    private static int getMeMin(int a, int b) {
        return a < b ? a : b;
    }

    private static int getMeMax(int a, int b) {
        return a > b ? a : b;
    }

    private static void split(int n) {
        System.out.println("Task" + n + "\n" + "------------------------------");
    }
}
