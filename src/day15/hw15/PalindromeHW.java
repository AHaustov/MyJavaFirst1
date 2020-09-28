package day15.hw15;

public class PalindromeHW {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("А роза упала на лапу Азора"));// -> true
        System.out.println(checkPalindrome("поп"));// -> true
        System.out.println(checkPalindrome("школа"));// -> false // алокш
    }

    public static String withoutSpace(String str) {
        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
            }
        }
        return equalSize(input);
    }

    public static String equalSize(String str) {
        return str.toLowerCase();
    }

    public static String reverseInput(String str) {
        String strReverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strReverse += str.charAt(i);
        }
        return equalSize(strReverse);
    }

    private static boolean checkPalindrome(String str) {
        for (int i = 0; i < withoutSpace(str).length(); i++) {
            if (reverseInput(withoutSpace(str)).charAt(i) != withoutSpace(str).charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
