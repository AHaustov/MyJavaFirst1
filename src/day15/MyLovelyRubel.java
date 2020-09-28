package day15;

public class MyLovelyRubel {
    public static void main(String[] args) {
        printSumInRub(1, 5);
      //  printSumInRub(11, 35);
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + rightWordInRussian(i));
        }
    }

    private static String rightWordInRussian(int i) {
        String output = "";
        String input = String.valueOf(i);
        String lastSymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastSymbol);
        if (lastDigit == 1) {
            output = "Rubel";
        } else if (lastDigit >= 5 || lastDigit == 0) {
            output = "Rubel";
        } else {
            output = "Rubel";
        }

        return output;
    }
}
