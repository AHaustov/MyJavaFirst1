package day07.hw;

public class HomeWork7 {

    /*The number 6 is a truly great number. Given two int values, a and b,
    return true if either one is 6. Or if their sum or difference is 6.
    Note: the function Math.abs(num) computes the absolute value of a number.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
*/

    public static void main(String[] args) {

        System.out.println(love6(6, 4)); //true
        System.out.println(love6(4, 5));// false
        System.out.println(love6(1, 5));// true
    }

    private static boolean love6(int i, int i1) {

        boolean i2=(Math.abs(i-i1)==6)||((Math.abs(i+i1))==6);

        return (i==6)||(i1==6)||i2;
    }
}
