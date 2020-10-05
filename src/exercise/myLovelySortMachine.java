package exercise;

public class myLovelySortMachine {
    public static void main(String[] args) {
        int seizeArray = 10;
        int[] intArray = createRandomArray(seizeArray);
        printIntArray(sortIntArray(intArray));

    }

    private static int getMeMinIntArray(int[] input) {
        int min = input[0];
        for (int i = 0; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
        }
        return min;
    }

    private static int maximal(int[] input) {
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

    private static int[] arrayWithOutMin(int[] input) {
        int[] output = new int[input.length - 1];
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] != getMeMinIntArray(input)) {
                output[i] = input[i];
            } else {
                for (int j = i; j < input.length - 1; j++) {
                    output[j] = input[j + 1];
                }
                break;
            }
        }
        return output;
    }

    private static int[] copyIntArray(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

    private static int[] sortIntArray(int[] input) {
        int[] output = new int[input.length];
        int[] temp = copyIntArray(input);
        System.out.print("This is my initial random Int Array: ");
        printIntArray(temp);
        for (int i = 0; i < input.length; i++) {
            output[i] = getMeMinIntArray(temp);
            if (temp.length > 1) {
                temp = arrayWithOutMin(temp);
            }
        }
        System.out.print("This is my sorted Int Array: ");
        return output;
    }

    private static int[] createRandomArray(int seize) {
        int[] output = new int[seize];
        for (int i = 0; i < seize; i++) {
            output[i] = (int) (Math.random() * 30);
        }
        return output;
    }


    private static void printIntArray(int[] input) {
        System.out.print("[ ");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println(input[input.length - 1] + "]");
    }

    private static void printDoubleArray(double[] input) {
        System.out.print("[ ");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.printf("%.3f", input[i] + ", ");
        }
        System.out.printf("%.3f ]\n", input[input.length - 1]);
    }

    private static void printStringArray(String[] input) {
        System.out.print("[ ");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println(input[input.length - 1] + " ]");
    }
}
