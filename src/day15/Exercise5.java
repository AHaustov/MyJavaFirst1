package day15;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("pop"));
        System.out.println(checkPalindrom("Oha Ho"));
    }

    private static boolean checkPalindrom(String str) {
        String input = str.toLowerCase();
        String input2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (input.charAt(i) != ' ') {
                input2 += input.charAt(i);
            }
        }
        String reverse = "";
        for (int i = input2.length() - 1; i >= 0; i--) {
            reverse += input2.charAt(i);
        }
        return input2.equals(reverse);
    }

}
