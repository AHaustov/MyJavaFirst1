package day10;

     /* 1.Напишите программу, которая находит чётные числа между a и b.
        2.Напишите программу, которая находит нечётные числа между a и b.
        3.Напишите программу, которая находит числа кратные 11 между a и b.
        4.Напишите программу, которая проверяет год на високосность. Кратный четырём.
        5.Напишите программу, которая находит простые числа между a и b.
        6.Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44. Найдите число или числа.
        7.Прочитайте в Википедии, какие года являются високосными и дополните предыдущую задачу.*/


public class hw10 {
    public static void main(String[] args) {

        split(1);
        System.out.println(findEvenNumber(3, 19));
        split(2);
        System.out.println(findOddNumber(5, 8));
        split(3);
        System.out.println(findNumber11(20, 100));
        split(4);
        System.out.println("Is this a LeapYear?:" + isLeapYear(2004));
        split(5);
        System.out.println(findPrimeNumbers(17, 56));
        split(6);
        System.out.println(findMyVerySpecialNumber());//--> less 3000 with %32=30 with %58=44
        split(7);
        System.out.println("Is this a LeapYear?:" + isRealLeapYearGregorian(2000));// false , every 1900+x*200 is not LeapYear
    }

    private static boolean isRealLeapYearGregorian(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    private static String findMyVerySpecialNumber() {
        String result = "";
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                result += " " + i;
            }
        }
        return result;
    }

    private static String findPrimeNumbers(int a, int b) {
        String result = "";
        for (int i = a; i <= b; i++) {
            for (int j = i; j >= 1; j--) {
                if (i % j == 0 && j != i && j != 1) {
                    break;
                } else if (j == 1) {
                    result += " " + i;
                }

            }

        }
        return result;
    }

    private static boolean isLeapYear(int a) {
        return a % 4 == 0;
    }

    private static String findNumber11(int a, int b) {
        String result = "";
        for (int i = a; i <= b; i++) {
            if (i % 11 == 0 && (i != 0)) {
                result += " " + i;
            }
        }
        return result;
    }

    private static String findOddNumber(int a, int b) {
        String result = "";
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                result += " " + i;
            }
        }
        return result;
    }

    private static String findEvenNumber(int a, int b) {
        String result = "";
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 && (i != 0)) {
                result += " " + i;
            }
        }
        return result;
    }

    private static void split(int a) {
        System.out.println("Task" + a + "\n" + "-------------------------------------");
    }
}
