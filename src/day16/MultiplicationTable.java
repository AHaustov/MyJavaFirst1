package day16;

public class MultiplicationTable {
    public static void main(String[] args) {
        createTable(10);
    }


    private static void createTable(int number) {
        int i = 1;
        while (i <= number) {
            int j = 1;
            while (j <= number) {
                System.out.printf("%3d", i * j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
