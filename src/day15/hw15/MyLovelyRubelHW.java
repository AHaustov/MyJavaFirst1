package day15.hw15;

public class MyLovelyRubelHW {
    public static void main(String[] args) {


        //printSumInRub(1, 5);
        printSumInRub(11, 35);
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + rightWordInRussian(i));
        }
    }

    private static String rightWordInRussian(int number) {
        String output = "";
        String input = String.valueOf(number);
        String lastSymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastSymbol);
        if (lastDigit == 1 && number != 11) {
            output = "рубль";
        } else if (lastDigit >= 5 || lastDigit == 0 || number > 10 && number < 15) {
            output = "рублей";
        } else {
            output = "рубля";
        }
        return output;
    }
}

