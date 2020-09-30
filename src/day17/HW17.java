package day17;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HW17 {
    public static void main(String[] args) {
        myNextInt();
    }

    private static void myNextInt() {
        int userAge;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        userAge = input.nextInt();
        System.out.println("Is this really your age?:" + userAge);
        boolean b = input.nextBoolean();
        System.out.println("Ok fine" + b);
        input.close();
    }
}
