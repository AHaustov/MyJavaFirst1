package day23.hw23;

public class WordSeperator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"
    }

    private static String repeatSeparator(String str, String seperator, int repeat) {
        String output = str;
        for (int i = 1; i < repeat; i++) {
            output += seperator + str;
        }
        return output;
    }
}
