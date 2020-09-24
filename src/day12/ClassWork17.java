package day12;

public class ClassWork17 {
    public static void main(String[] args) {
       /* System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
*/
       /* System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false*/


     /*   System.out.println(seeColor("redxx"));// → "red"
        System.out.println(seeColor("xxred")); //→ ""
        System.out.println(seeColor("blueTimes"));// → "blue"*/
/*
        System.out.println(extraFront("Hello"));// →"HeHeHe"
        System.out.println(extraFront("ab"));// →"ababab"
        System.out.println(extraFront("H"));// →"HHH"*/


        /*System.out.println(extraEnd("Hello")); //→ "lololo"
        System.out.println(extraEnd("ab")); //→ "ababab"
        System.out.println(extraEnd("Hi"));// → "HiHiHi"*/
       /* System.out.println(withoutEnd("Hello"));// → "ell"
        System.out.println(withoutEnd("java"));// → "av"
        System.out.println(withoutEnd("coding"));// → "odin"*/
       /* System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"*/
      /*  System.out.println(diff21(19));// → 2
        System.out.println(diff21(10));// → 11
        System.out.println(diff21(21)); //→ 0
        System.out.println(diff21(25)); //→ 8*/
        System.out.println(nearHundred(93));// → true
        System.out.println(nearHundred(90));// → true
        System.out.println(nearHundred(89));// → false

    }

    private static boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10);
    }

    private static int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return 21 - n;
        }
    }

    private static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    private static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static String extraEnd(String str) {
        String temp = str.substring(str.length() - 2);
        return temp + temp + temp;
    }

    private static String startWord(String str, String word) {
       /* if (str.startsWith(word)) {
            return word;*/
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, 1) + word.substring(1);
        } else {
            return str.substring(0, 1);
        }
    }

    private static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.charAt(0) + b.substring(b.length() - 1);
    }

    private static String middleThree(String candy) {

        return "";
    }

    private static boolean endsLy(String str) {

        return str.endsWith("ly");
    }

    private static String theEnd(String str, boolean b) {
        if (b) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }


    }

    private static boolean inOrder(int a, int b, int c, boolean bOK) {
        //  return bOK && c > b || b > a && c > b;
        if (b > a && c > b) {
            return true;
        } else if (bOK && b <= a) {
            return true;
        }
        return false;
    }
}
