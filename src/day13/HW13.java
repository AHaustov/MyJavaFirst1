package day13;

public class HW13 {
    public static void main(String[] args) {
        int lengthOfPassword = 10; // length of password to generate
        String rangeOfPW = "AZaz09!)"; //range of possible chars you can use for password
        String possibleChar = generatePossibleChar(rangeOfPW); //static pool of my useable chars
        System.out.println(myLovelyPWGenerator(lengthOfPassword,possibleChar));
        //System.out.println(possibleChar);
    }

    private static String generatePossibleChar(String str) {
        String rangeOfChars = "";
        for (int i = str.codePointAt(0); i <= str.codePointAt(1); i++) {
            rangeOfChars += (char) (i);
        }
        for (int i = str.codePointAt(2); i <= str.codePointAt(3); i++) {
            rangeOfChars += (char) (i);
        }
        for (int i = str.codePointAt(4); i <= str.codePointAt(5); i++) {
            rangeOfChars += (char) (i);
        }
        for (int i = str.codePointAt(6); i <= str.codePointAt(7); i++) {
            rangeOfChars += (char) (i);
        }
        return rangeOfChars;
    }

    private static String myLovelyPWGenerator(int wordLength , String range) {
        String password = "";
        for (int i = 0; i < wordLength; i++) {
            password += randomChar(range);
        }
        return password;
    }

    private static char randomChar(String str) {
        int randomPlace = (int) (Math.random() * (str.length() - 1) + 1);
        char c = str.charAt(randomPlace);
        return c;
    }

}
