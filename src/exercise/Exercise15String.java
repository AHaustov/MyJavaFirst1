package exercise;

public class Exercise15String {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));// → 2
        System.out.println(countYZ("day fez"));// → 2
        System.out.println(countYZ("day fyyyz"));// → 2
    }

    private static int countYZ(String str) {
        int count = 0;
        String temp = str.toLowerCase().trim();
        for (int i = 0; i < temp.length(); i++) {
            if (!Character.isLetter(temp.charAt(i)) && i != 0) {
                count = (temp.charAt(i - 1) == 'y' || temp.charAt(i - 1) == 'z') ? count + 1 : count;
            }
        }
        count = (temp.charAt(temp.length() - 1) == 'y' || temp.charAt(temp.length() - 1) == 'z') ? count + 1 : count;
        return count;
    }
}
