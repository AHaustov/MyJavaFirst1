package day16;

public class day16 {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
       //showCharNumber("Съешь же ещё этих мягких французских булок, да выпей чаю.");
       //showCharNumber("Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.");

    }
    public static char makeEnigma(char c) {
        char enigma = 0;
        if (c < 65) {
            enigma = c;
        } else if (c == 1077 || c == 1076) {
            enigma = (char) (c + 2);
        } else if (c == 1105) {
            enigma = (char) (c - 25);
        } else if (c >= 1101 && c <= 1103) {
            enigma = (char) (c - 29);
        } else if (c == 1075) {
            enigma = (char) (c + 30);
        } else {
            enigma = (char) (c + 3);
        }
        return enigma;
    }
    private static void enigmaCaesar(String str) {
        int i = 0;
        while (i < str.length()) {
            System.out.print(makeEnigma(str.charAt(i)));
            i++;
        }
        System.out.println();
    }

   /* public static void showCharNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.codePointAt(i) + " ");
        }
        System.out.println();
    }*/
}
