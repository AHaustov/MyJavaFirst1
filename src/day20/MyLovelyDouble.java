package day20;

public class MyLovelyDouble {
    public static void main(String[] args) {
        double min = 50.00;
        double max = 150.00;
        double[] myDoubleArr = createDoubleArray(min, max);

    }

    private static double[] createDoubleArray(double min, double max) {
        int size = (int) (Math.random() * 15);
        double[] output = new double[size];
        for (int i = 0; i < size; i++) {
            double myRandomTemp = Math.random() * ((max - min) + 1) + min;
            output[i] = myRandomTemp;
        }
        return output;
    }

    private static void printDoubleArray(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if (i < input.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
    }
}
