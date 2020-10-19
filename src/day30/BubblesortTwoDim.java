package day30;

import day20.MyLovelyDouble;

public class BubblesortTwoDim {
    public static void main(String[] args) {
        double[] myLovelyDoubleArray = new double[]{3.14, 6.18, 18.0, 1.0, 0.5, 100.0};
        MyLovelyDouble.printDoubleArray(myLovelyDoubleArray);
        double[] newArray = copyArray(myLovelyDoubleArray);
        bubbleSortDouble(newArray);
        MyLovelyDouble.printDoubleArray(newArray);
    }

    private static void bubbleSortDouble(double[] arr) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    private static double[] copyArray(double[] arr) {
        double[] copy = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }


}

