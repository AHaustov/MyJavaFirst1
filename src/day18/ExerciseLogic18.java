package day18;

public class ExerciseLogic18 {
    public static void main(String[] args) {
        //System.out.println(makeBricks(3, 1, 8));// → true
        //System.out.println(makeBricks(3, 1, 9));// → false
        //System.out.println(makeBricks(3, 2, 10));// → true
        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false

    }

    private static boolean prefixAgain(String str, int N) {
        //return str.substring(N).contains(str.substring(0, N));
        int length = str.length();
        String prefix = str.substring(0, N);
        for (int i = N; i < length; i++) {
            if (N + i <= length) {
                if (prefix.equals(str.substring(i, N + i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean makeBricks(int countSmallBricks, int countBigBricks, int goal) {
        int smallBricks = 1;
        int bigBricks = 5;
        int size = countSmallBricks * smallBricks + countBigBricks * bigBricks;
        if (size >= goal) {
            return true;
        }
        return false;
        //return (countSmallBricks * 1 + countBigBricks * 5) >= goal;
    }
}
