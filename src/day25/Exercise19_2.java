package day25;

public class Exercise19_2 {
    public static void main(String[] args) {
        /*int[] arr1 = new int[]{1, 2, 2, 1};
        int[] arr2 = new int[]{1, 1};
        int[] arr3 = new int[]{1, 2, 2, 1, 13};
        int[] arr4 = new int[]{1, 2, 2, 1, 13, 15};
        int[] arr5 = new int[]{1, 2, 2, 1, 13, 15, 15};

        System.out.println(sum13(arr1));// → 6
        System.out.println(sum13(arr2));// → 2
        System.out.println(sum13(arr3));// → 6
        System.out.println(sum13(arr4));//  → 6
        System.out.println(sum13(arr5));//   → 21*/
        /*int[] arr1 = new int[]{0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 4};
        System.out.println(lucky13(arr1));// → true
        System.out.println(lucky13(arr2));// → false
        System.out.println(lucky13(arr3));// → false*/


    }

    private static boolean lucky13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                return false;
            }
        }
        return true;
    }

    private static int sum13(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (!(arr1[i] == 13 || (i > 0 && arr1[i - 1] == 13))) {
                sum += arr1[i];
            }
        }
        return sum;
    }
}
