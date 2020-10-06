package day21.hw21;
// 1 .Даны два целых числа,
// создайте массив с чётными числами в этом диапазоне.
// создайте массив с простыми числами в этом диапазоне.

import day20.FillAndPrint;

public class ClassWork21 {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int[] arr = createEvenArray(a, b);
        FillAndPrint.myPrintIntArray(arr);
        int[] primeArr = createPrimeArray(a, b);
        FillAndPrint.myPrintIntArray(primeArr);
    }

    private static boolean isPrimeInt(int a) {
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && a != i && i != 1) {
                break;
            } else if (i == 1) {
                return true;
            }
        }
        return false;
    }

    private static int[] createPrimeArray(int a, int b) {
        int size = 0;
        for (int i = a; i <= b; i++) {
            if (isPrimeInt(i)) {
                size++;
            }
        }
        int count = 0;
        int[] output = new int[size];
        for (int i = a; i <= b; i++) {
            if (isPrimeInt(i)) {
                output[count] = i;
                count++;
            }
        }
        return output;
    }

    private static int[] createEvenArray(int a, int b) {
        int size = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                size++;
            }
        }
        int[] output = new int[size];
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                output[count] = i;
                count++;
            }
        }
        return output;
    }
}
