package day23;

public class Converter {
    public static String convertDecimalToBinary(int numberDecimal,int coefficent) {
        String resultBinary = "";
        while (numberDecimal > 0) {
            int remainder;
            remainder = numberDecimal % coefficent;
            resultBinary = remainder + resultBinary;
            numberDecimal /= coefficent;
        }
        return resultBinary;
    }

    public static int convertBinaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int count = 0;
        int remainder = Integer.parseInt(binaryNumber);
        while (remainder > 0) {
            decimalNumber += remainder % 10 * Math.pow(2, count);
            remainder /= 10;
            count++;
        }
        return decimalNumber;
    }
}
