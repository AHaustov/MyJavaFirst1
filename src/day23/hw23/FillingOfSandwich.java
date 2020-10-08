package day23.hw23;

public class FillingOfSandwich {
    public static void main(String[] args) {
        String bread = "bread";
        System.out.println(getSandwich("breadjambread", bread));// →"jam"
        System.out.println(getSandwich("xxbreadjambreadyy", bread));// →"jam"
        System.out.println(getSandwich("xxbreadyy", bread));// →"*"
    }

    private static String getSandwich(String str, String bread) {
        String output = "*";
        if (str.length() < 2*bread.length()) {
            return output;
        } else if (str.startsWith(bread) && str.endsWith(bread)) {
            return str.substring(bread.length(), str.length() - bread.length());
        } else if (!(str.startsWith(bread)) && str.contains(bread)) {
            return getSandwich(str.substring(1), bread);
        } else if (!(str.endsWith(bread)) && str.contains(bread)) {
            return getSandwich(str.substring(0, str.length() - 2), bread);
        } else {
            return output;
        }
    }

}
