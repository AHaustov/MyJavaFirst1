package day07;

public class ClassWorkBoolean {
    public static void main(String[] args) {

        System.out.println(smartDepositBox(true, false)); // true
        System.out.println(smartDepositBox(false, true)); // true
        System.out.println(smartDepositBox(false, false)); // false

        split();

        System.out.println(smartDepositBoxVersionTwo(true, false)); // false
        System.out.println(smartDepositBoxVersionTwo(false, true)); // false
        System.out.println(smartDepositBoxVersionTwo(false, false)); // false
        System.out.println(smartDepositBoxVersionTwo(true, true)); // true

        split();

        boolean mamaPermission = true;
        boolean papaPermission = false;
        boolean omaPermission = true;

        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));

        split();

        System.out.println(bigBadaBoom(true, true)); // true
        System.out.println(bigBadaBoom(false, false)); // false
        System.out.println(bigBadaBoom(true, false)); // false

        split();



    }

    private static boolean bigBadaBoom(boolean b, boolean b1) {
        return b&b1;
    }

    private static boolean verySmartDepositBoxVersionThree(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {
        return mamaPermission && papaPermission || omaPermission;
    }

    private static Boolean smartDepositBoxVersionTwo(boolean b, boolean b1) {
        return b & b1;
    }

    public static void split() {
        System.out.println("-----------------");
    }


    private static Boolean smartDepositBox(boolean b1, boolean b2) {
        return b1 || b2;
    }
}
