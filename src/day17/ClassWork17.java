package day17;

public class ClassWork17 {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
        System.out.println(countCode("aaacodebbb"));// → 1
        System.out.println(countCode("codexxcode"));// → 2
        System.out.println(countCode("cozexxcope"));// → 2
        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b"));// → true
        System.out.println(bobThere("bac"));// → false
        System.out.println(repeatEnd("Hello", 3));// → "llollollo"
        System.out.println(repeatEnd("Hello", 2));// → "lolo"
        System.out.println(repeatEnd("Hello", 1));// → "o"
        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false
    }

    private static boolean prefixAgain(String str, int N) {
        String prefix = str.substring(0, N);
        return str.substring(N).contains(prefix);
    }

    private static String repeatEnd(String str, int n) {
        String output = "";
        if (str.length() >= n) {
            for (int i = 1; i <= n; i++) {
                output += str.substring(str.length() - n);
            }
        }
        return output;
    }

    private static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    private static int countCode(String str) {
        int number = 0;
        String input = str;
        for (int i = 0; i < input.length(); i++) {
            if (input.length() >= 4) {
                if (input.startsWith("co") && input.charAt(3) == 'e') {
                    number++;
                }
                input = input.substring(i);
            }
        }
        return number;
    }

    private static String doubleChar(String str) {
        String output = "";
        int i = 0;
        while (i < str.length()) {
            output += "" + str.charAt(i) + str.charAt(i);
            i++;
        }
        return output;
    }
}
