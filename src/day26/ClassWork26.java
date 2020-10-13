package day26;

public class ClassWork26 {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));// → "c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// → "13"
        System.out.println(wordEnds("XY1XY", "XY"));// → "11"
    }

    private static String wordEnds(String str, String middle) {
        String output = "";
        String input = str;
        while (input.contains(middle)) {
            if (input.indexOf(middle) > 0) {
                output += "" + input.charAt(input.indexOf(middle) - 1);
            }
            if ((input.indexOf(middle) + middle.length()) < input.length()) {
                output += "" + input.charAt(input.indexOf(middle) + middle.length());
            }
            input = input.substring(input.indexOf(middle) + middle.length());
        }
        return output;
    }
}
