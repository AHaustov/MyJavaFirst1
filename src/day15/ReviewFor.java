package day15;

public class ReviewFor {
    public static void main(String[] args) {


        System.out.println(checkKyrilicLetterInWord("Wasili"));
        System.out.println(checkKyrilicLetterInWord("Quark"));
        System.out.println(checkKyrilicLetterInWord("quer"));
    }

    private static boolean checkKyrilicLetterInWord(String word) {
        if(word.toLowerCase().contains("q")){
            return true;
        }
        return false;
    }
}
