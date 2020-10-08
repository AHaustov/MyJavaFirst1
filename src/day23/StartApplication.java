package day23;

import static day06.hw6.hw6.split;

public class StartApplication {
    public static void main(String[] args) {
        int hexValue1 = 0x100; // Шестнадцатеричная система счисления
        int binar = 0B1001_1001; // Двоичная система счисления
        int octal = 0757; // восьмеричная система счисления
        int decimalnumber = 99;
        String binary = "10001001";
        int coefficent=2;
        String myBinaryNumber
                = Converter.convertDecimalToBinary(decimalnumber,coefficent);
        System.out.println("Result of Converter: "
                + myBinaryNumber
                + " of the Decimalnumber: "
                + decimalnumber);
        split();
        System.out.println("The Decimal of : "
                + binary + " is "
                + Converter.convertBinaryToDecimal(binary));
    }
}
