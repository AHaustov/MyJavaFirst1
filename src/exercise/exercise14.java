package exercise;

public class exercise14 {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));// → true
        System.out.println(sameStarChar("xy*zzz"));// → false
        System.out.println(sameStarChar("*xa*az"));// → false
    }

    private static boolean sameStarChar(String str) {
        char star = '*';
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 || i == str.length() - 1) && str.charAt(i) == star) {
                return false;
            } else if (str.charAt(i) == star && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        String outputStar = String.valueOf(star);
       // return str.contains(outputStar);
        return str.contains(""+star);
    }
}
