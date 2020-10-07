package day22;

public class Excercise16 {
    public static void main(String[] args) {
        split(1);
        System.out.println(factorial(1));// → 1
        System.out.println(factorial(2));// → 2
        System.out.println(factorial(3));// → 6
        split(2);
        System.out.println(bunnyEars2(0));// → 0
        System.out.println(bunnyEars2(1));// → 2
        System.out.println(bunnyEars2(2));// → 5
        split(3);
        System.out.println(count7(717));// → 2
        System.out.println(count7(7));// → 1
        System.out.println(count7(123));// → 0
        split(4);
        System.out.println(countX("xxhixx"));// → 4
        System.out.println(countX("xhixhix"));// → 3
        System.out.println(countX("hi"));// → 0
        split(5);
        System.out.println(changePi("xpix"));// → "x3.14x"
        System.out.println(changePi("pipi"));// → "3.143.14"
        System.out.println(changePi("pip"));// → "3.14p"
        split(6);
        System.out.println(pairStar("hello"));// → "hel*lo"
        System.out.println(pairStar("xxyy"));// → "x*xy*y"
        System.out.println(pairStar("aaaa"));// → "a*a*a*a"
        split(7);
        System.out.println(countAbc("abc"));// → 1
        System.out.println(countAbc("abcxxabc")); //→ 2
        System.out.println(countAbc("abaxxaba"));//→ 2
        split(8);
        System.out.println(countHi2("ahixhi"));// → 1
        System.out.println(countHi2("ahibhi"));// → 2
        System.out.println(countHi2("xhixhi"));// → 0
        split(9);
        System.out.println(strCount("catcowcat", "cat"));// → 2
        System.out.println(strCount("catcowcat", "cow"));// → 1
        System.out.println(strCount("catcowcat", "dog"));// → 0
        split(10);
        System.out.println(bunnyEars(0));// → 0
        System.out.println(bunnyEars(1));// → 2
        System.out.println(bunnyEars(2));// → 4
        split(14);
        System.out.println(noX("xaxb"));// → "ab"
        System.out.println(noX("abc"));// → "abc"
        System.out.println(noX("xx"));// → ""
        split(15);
        System.out.println(endX("xxre"));// → "rexx"
        System.out.println(endX("xxhixx"));// → "hixxxx"
        System.out.println(endX("xhixhix"));// → "hihixxx"
    }

    private static String endX(String str) {
        if (str.length() == strCount(str, "x")) {
            return str;
        } else if (str.startsWith("x")) {
            return endX(str.substring(1)) + "x";
        } else {
            return str.charAt(0) + endX(str.substring(1));
        }
    }

    private static String noX(String str) {
        if (str.length() < 1) {
            return str;
        } else if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        } else {
            return str.charAt(0) + noX(str.substring(1));
        }
    }

    private static int bunnyEars(int bunny) {
        if (bunny == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunny - 1);
        }
    }

    private static int strCount(String str, String piece) {
        if (str.length() < piece.length()) {
            return 0;
        } else if (str.startsWith(piece)) {
            return 1 + strCount(str.substring(piece.length()), piece);
        } else {
            return strCount(str.substring(1), piece);
        }
    }

    private static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.startsWith("xh")) {
            return countHi2(str.substring(2));
        } else if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        } else {
            return countHi2(str.substring(1));
        }
    }

    private static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        } else if (str.startsWith("abc") ^ str.startsWith("aba")) {
            return 1 + countAbc(str.substring(3));
        } else {
            return countAbc(str.substring(1));
        }
    }

    private static String pairStar(String str) {
        if (str.length() == 1) {
            return str;
        } else if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }

    private static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.startsWith("pi")) {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }

    private static void split(int task) {
        System.out.println("\n" + task + ".");
        System.out.println("-------------------------");
    }

    private static int countX(String str) {
        if (str.startsWith("x")) {
            return 1 + countX(str.substring(1));
        } else if (str.length() > 1) {
            return countX(str.substring(1));
        } else {
            return str.endsWith("x") ? 1 : 0;
        }
    }

    private static int count7(int input) {
        if (input == 0) {
            return 0;
        } else if (input % 10 == 7) {
            return 1 + count7(input / 10);
        } else {
            return count7(input / 10);
        }
    }

    private static int bunnyEars2(int bunny) {
        if (bunny == 0) {
            return bunny = 0;
        } else if (bunny % 2 != 0) {
            return 2 + bunnyEars2(bunny - 1);
        } else {
            return 3 + bunnyEars2(bunny - 1);
        }
    }

    private static int factorial(int factor) {
        if (factor < 1) {
            return 1;
        } else {
            return factor * factorial(factor - 1);
        }
    }
}
