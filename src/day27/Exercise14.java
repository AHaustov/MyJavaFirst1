package day27;

public class Exercise14 {
    public static void main(String[] args) {
      /*  System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"*/

       /* System.out.println(repeatFront("Chocolate", 4));// → "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// → "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// → "IcI"*/

        /*System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBBB"));// → false*/

        System.out.println(oneTwo("abc"));// → "bca"
        System.out.println(oneTwo("tca"));// → "cat"
        System.out.println(oneTwo("tcagdo"));// → "catdog"

    }

    private static String oneTwo(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 3 == 2) {
                output += str.substring(i - 1, i + 1) + str.charAt(i - 2);
            }
        }
        return output;
    }

    private static boolean xyzMiddle(String str) {
        return Math.abs(
                (str.substring(0, str.indexOf("xyz")).length()
                        - str.substring(str.indexOf("xyz") + 3).length())
        ) <= 1;
    }

    private static String repeatFront(String str, int number) {
        String output = "";
        for (int i = 0; i < number; i++) {
            output += str.substring(0, number - i);
        }
        return output;
    }

    private static String starOut(String str) {
        String output = "";
        char star = '*';
        for (int i = 0; i < str.length(); i++) {
            if (!((str.charAt(i) == star) ||
                    (i > 0 && str.charAt(i - 1) == star) ||
                    ((i < str.length() - 1) && str.charAt(i + 1) == star))) {
                output += str.charAt(i);
            }
        }
        return output;
    }
}
