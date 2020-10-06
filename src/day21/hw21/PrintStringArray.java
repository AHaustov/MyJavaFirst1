package day21.hw21;

public class PrintStringArray {
    public static void main(String[] args) {
        String[] germancities = new String[]{"Berlin", "Munich", "Hamburg"};
        printStringArray(germancities);
    }

    private static void printStringArray(String[] str) {
        System.out.print("[ ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            if (i != str.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}

