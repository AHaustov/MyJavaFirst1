package day06;

public class Classwork3 {
    public static void main(String[] args) {


        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

        split();

        nonStart("Hello", "There");// → "ellohere"
        nonStart("java", "code");// → "avaode"
        nonStart("shotl", "java");// → "hotlava"

        split();

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }

    private static String middleThree(String str) {
        String result = str.substring(str.length()/2-1,str.length()/2+2);
        return result;

    }

    public static void split() {
        System.out.println("-----------------");

    }

    private static void nonStart(String s1, String s2) {
        String result = s1.substring(1) + s2.substring(1);
        System.out.println(result);

    }

    private static String firstHalf(String s1) {
        return s1.substring(0, s1.length() / 2);
    }
}
