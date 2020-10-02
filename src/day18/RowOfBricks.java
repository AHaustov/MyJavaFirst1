package day18;

public class RowOfBricks {
    public static void main(String[] args) {
        /**
         * We want to make a row of bricks that is goal inches long.
         *
         * We have a number of small bricks (1 inch each) and big bricks (5 inches each).
         * Return true if it is possible to make the goal by choosing from the given bricks.
         *
         * This is a little harder than it looks and can be done without any loops.
         * *
         * See also: Introduction to MakeBricks:*/
        System.out.println(makeBricks(3, 1, 8));// →true
        System.out.println(makeBricks(3, 1, 9));// →false
        System.out.println(makeBricks(3, 2, 10));// →true

    }

    private static boolean makeBricks(int brickSortOne, int brickSortTwo, int wallLength) {
        for (int i = 0; i <= brickSortOne; i++) {
            for (int j = 0; j <= brickSortTwo; j++) {
                if ((i + j * 5) == wallLength) {
                    return true;
                }
            }
        }
        return false;
    }
}
