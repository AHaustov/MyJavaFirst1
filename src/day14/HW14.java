package day14;

public class HW14 {
    public static void main(String[] args) {
        split(1);
        createChessBoard();
        split(2);
        multiplicationTable();
        split(3);
        triangle();
        split(4);
        myLovelyPyramideOne();
        split(5);
        myLovelyPyramideTwo();
        split(6);
        floydsTriangle();
        split(7);
        snowFlake(10);
    }

    private static void snowFlake(int a) {

        for (int i = 0; i < a / 2; i++) { //UpperLanes
            String result = "";
            for (int j = 0; j < a / 2; j++) { //Leftside
                if (j == i) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "*"; //Middle

            for (int j = a / 2 - 1; j >= 0; j--) { //Rightside
                if (j == i) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            System.out.println(result);
        }
        String resultMidline = "";//Middleline
        for (int i = 0; i < a; i++) {
            resultMidline += "*";
        }
        System.out.println(resultMidline);

        for (int i = a/2-1; i >=0 ; i--) { //Bottomlines
            String result = "";
            for (int j = 0; j < a / 2; j++) { //Leftside
                if (j == i) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "*";

            for (int j = a / 2 - 1; j >= 0; j--) { //Rightside
                if (j == i) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            System.out.println(result);
        }
    }

    private static void floydsTriangle() {
        int n = 0;
        for (int i = 0; i < 5; i++) {
            String result = "";
            for (int j = 0; j <= i; j++) {
                n++;
                result += n + " ";
            }
            System.out.println(result);
        }
    }

    private static void myLovelyPyramideTwo() {

        for (int i = 1; i <= 6; i++) {
            String result = "";
            for (int j = 6; j > i; j--) {
                result += " ";
            }
            for (int j = 1; j < i; j++) {
                result += j;
            }
            for (int j = i; j > 0; j--) {
                result += j;
            }
            for (int j = 6; j > i; j--) {
                result += " ";
            }
            System.out.println(result);
        }
    }

    private static void myLovelyPyramideOne() {
        for (int i = 1; i <= 6; i++) {
            String result = "";
            for (int j = 6; j > i; j--) {
                result += " ";
            }
            for (int j = 1; j < 2 * i; j++) {
                result += i;
            }
            for (int j = 6; j > i; j--) {
                result += " ";
            }
            System.out.println(result);
        }
    }

    private static void triangle() {

        for (int i = 0; i < 10; i++) {
            String result = "";
            for (int j = 0; j < i; j++) {
                result += "*";
            }
            System.out.println(result);
        }
    }

    private static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            String result = "";
            for (int j = 1; j <= 10; j++) {
                result += i * j + " ";
            }
            System.out.println(result.trim());
        }
    }

    private static void split(int a) {
        System.out.println("\n" + "Task" + a + "\n" + "--------------------------");
    }

    private static void createChessBoard() {

        for (int i = 0; i < 8; i++) {
            String result = "";
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    result += '*';
                } else {
                    result += '_';
                }
            }
            System.out.println(result);
        }
    }
}
