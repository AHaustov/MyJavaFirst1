package day07;

public class Logic01 {
    public static void main(String[] args) {

        System.out.println(doorBell(true, true)); // false
        System.out.println(doorBell(false, false)); //false
        System.out.println(doorBell(true, false)); // true

        split();

        boolean electro=true;
        boolean internet=true;

       // smartDoorCheckKey(electro,internet);
    }

   // private static boolean smartDoorCheckKey(boolean electro, boolean internet) {
   // }

    private static void split() {

        System.out.println("-----------------------");
    }

    private static boolean doorBell(boolean b, boolean b1) {

        return b^b1;

    }
}
