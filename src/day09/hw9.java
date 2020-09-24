package day09;

   /*1.Даны два целых числа, верните большее из двух. Если числа равны, то верните ноль.

        moreOrLess(5, 6) -> 6
        moreOrLess(5, 5) -> 0
        moreOrLess(0, 100) -> 100

       2. Даны три целых числа, верните их сумму. Если первое и третье числа равны друг другу, то верните второе, если
          сумма равна нулю, то верните -1.

            mySum(5, 6, 5) -> 6
            mySum(5, 6, 7) -> 18
            mySum(0, 0, 0) -> 0
            mySum(0, -5, 5) -> -1

       3. Буквы в строке
            Вывести каждую букву американского алфавита от A-Z по 4 буквы в строке.
       4. Ряд Фибоначчи
            Выведите на экран первые 11 членов последовательности Фибоначчи.
            первый и второй члены последовательности равны единицам
            а каждый следующий — сумме двух предыдущих
            То есть числа Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.
        5.  The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is
            not a weekday or we're on vacation. Return true if we sleep in.

            sleepIn(false, false) → true
            sleepIn(true, false) → false
            sleepIn(false, true) → true*/

public class hw9 {
    public static void main(String[] args) {
        System.out.println("1.-----------------------------");

        System.out.println(moreOrLess(5, 6));//-> 6
        System.out.println(moreOrLess(5, 5));//-> 0
        System.out.println(moreOrLess(0, 100)); //> 100

        System.out.println("2.-----------------------------");

        System.out.println(mySum(5, 6, 5));// -> 6
        System.out.println(mySum(5, 6, 7));//-> 18
        System.out.println(mySum(0, 0, 0)); //-> 0
        System.out.println(mySum(0, -5, 5));//-> -1

        System.out.println("3.-----------------------------");

        myLovelyAlphabet();

        System.out.println("4.-----------------------------");

        myLovelyFibonacci(11);

        System.out.println("5.-----------------------------");

        System.out.println(sleepIn(false, false));// → true
        System.out.println(sleepIn(true, false)); //→ false
        System.out.println(sleepIn(false, true));// → true
    }

    private static void myLovelyAlphabet() {
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            System.out.print(c);
            if ((i) % 4 == 0) {
                System.out.println("");
            }

        }
        System.out.println("");
    }

    private static void myLovelyFibonacci(int fibo) {
        int result;
        int tempResult1 = 1;
        int tempResult2 = 0;

        for (int i = 0; i < fibo; i++) {
            result = tempResult1 + tempResult2;
            System.out.print(result + " ");
            tempResult1 = tempResult2;
            tempResult2 = result;
        }
        System.out.println("");
    }

    private static boolean sleepIn(boolean b, boolean b1) {
        return !b || b1;
    }

    private static int mySum(int a, int b, int c) {
        int result = a + b + c;
        if (a == c) {
            result = b;
        } else if (result == 0) {
            result = -1;
        }

        return result;
    }

    private static int moreOrLess(int a, int b) {
        if (a < b) {
            return b;
        } else if (a > b) {
            return a;
        } else return 0;
    }
}
