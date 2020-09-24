package day09;

public class ClassWork4 {
    public static void main(String[] args) {

        int lines = 10;
    //    getStars(lines);
        simpleString();
    }

    private static void simpleString() {
        String text="One Word";
        text= text+" Two";
        System.out.println(text);

    }

    private static void getStars(int number) {

        String star = "*";
        String row = "";

        for (int i = 0; i < number; i++) {

            row+=star;
          //  row = row + star;
            System.out.println(row);

        }


    }
}
