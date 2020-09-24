package day09;

public class HelloIf {
    public static void main(String[] args) {

        //ifIntroductionOne();
        // ifIntroductionTwo();
        //ifIntroductionThree();
        ifIntroductionFour();

    }

    private static void ifIntroductionFour() {
if(true){
    System.out.println("Everything is fine");
}
    }

    private static void ifIntroductionThree() {
        int age = 14;
        if (age < 16) {
            System.out.println(("Kein Alkohol für dich"));
        } else if (age >= 16 && age < 18) {
            System.out.println("Bier und Wein ist ok");

        }else {
            System.out.println("Spirituosen sind auch ok");
        }
    }

    private static void ifIntroductionTwo() {
        if (3 > 5) {
            System.out.println("Wahr");
        } else {
            System.out.println("Falsch");
        }
    }

    private static void ifIntroductionOne() {
        boolean permission = true;
        boolean denied = true;

        if (!denied) {
            System.out.println("You can go to Camp");
        } else {
            System.out.println("You have to stay at Home");
        }
    }

}
