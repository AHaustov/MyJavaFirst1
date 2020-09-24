package day06;

public class Classwork2 {
    public static void main(String[] args) {

        makeOutWord("<<>>","Yay");
        makeOutWord("<<>>", "WooHoo"); //→ "<<WooHoo>>"
        makeOutWord("[[]]", "word") ;//→ "[[word]]"
    }

    private static void makeOutWord(String s1,String s2) {
        String result= s1.substring(0,2)+s2+s1.substring(2);
        System.out.println(result);
    }
}
