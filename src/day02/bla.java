package day02;
// Java program to demonstrate  
// pow() method of BigInteger 

import java.math.BigInteger;

public class bla {

    public static void main(String[] args) {

        // Creating BigInteger object 
        BigInteger b1;

        b1 = new BigInteger("321456");
        int exponent = 5;

        // apply pow() method 
        BigInteger result = b1.pow(exponent);

        // print result 
        System.out.println("Result of pow operation between BigInteger "
                + b1 + " and exponent " + exponent + " equal to " + result);
    }
}