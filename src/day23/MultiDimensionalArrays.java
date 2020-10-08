package day23;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //magicMonth();
        //simpleTable();
        //anotherArray();
        //arrayFour();
        arrayFive();


    }

    private static void arrayFive() {
        int[][] example = {
                {1},
                {2, 2},
                {3, 3, 3},
                {4, 4, 4, 4},
                {5, 5, 5, 5, 5},
        };
        for (int[] element : example) {
            for (int ele : element) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static void arrayFour() {
        int[][] a1 = new int[5][];
        a1[0] = new int[1];
        a1[1] = new int[20];
        a1[2] = new int[0];
        a1[3] = new int[7];
        a1[4] = new int[5];
        for (int[] element : a1) {
            for (int ele : element) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static void anotherArray() {
        int[][][] a1 = new int[3][4][5];
        byte[][][] byteArray = {
                {
                        {0, 1, 2},
                        {3, 4, 5},
                        {6, 7, 8},
                }, {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
        }
        };
    }

    private static void printStringArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    private static void simpleTable() {
        String[][] myArray = new String[5][3];

    }

    public static void magicMonth() {
        int[][] monthCalendar;
        monthCalendar = new int[4][7];

        for (int i = 0; i < monthCalendar.length; i++) {
            for (int j = 0; j < monthCalendar[i].length; j++) {
                monthCalendar[i][j] = i * 7 + j + 1;
                System.out.printf("%3d", monthCalendar[i][j]);
            }
            System.out.println();
        }
    }
}
