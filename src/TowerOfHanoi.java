public class TowerOfHanoi {
    private static String[][] tower = new String[4][3];

    public static void main(String[] args) {
        fillTowerStart(tower);
        printHanoi(tower);
    }

    private static void sortHanoi(int n, int from_rod, int to_rod, int aux_rod) {
        if (n == 1) {
            tower[isTop(tower, to_rod) + 1][to_rod] = tower[isTop(tower, from_rod)][from_rod];
            tower[isTop(tower, from_rod)][from_rod] = "";
        }else{
            sortHanoi(n-1,from_rod,aux_rod,to_rod);

        }
    }

    private static int isTop(String[][] arr, int y) {
        int row = 0;
        while (arr[row][y].isEmpty() && row < arr.length - 1) {
            row++;
        }
        return row;
    }

    private static void printHanoi(String[][] input) {
        for (String[] row : input) {
            for (String element : row) {
                System.out.printf("%-5s", element);
            }
            System.out.println();
        }
    }

    private static void fillTowerStart(String[][] tower) {
        String star = "*";
        for (int i = 0; i < tower.length; i++) {
            for (int j = 0; j < tower[i].length; j++) {
                tower[i][j] = "";
            }
        }
        for (int i = 0; i < tower.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                tower[i][0] += star;
            }
        }
    }
}
