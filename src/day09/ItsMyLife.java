package day09;

public class ItsMyLife {
    public static void main(String[] args) {

        // loop();
        // forIntroductionOne();
        forIntroductionTwo();


    }

    private static void forIntroductionTwo() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Schritt" + i);

        }
    }

    private static void forIntroductionOne() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
        }
        for (int i = 0; i < 20; i++) {
            a++;
        }
        System.out.println(a);
    }

    //for Schleife (Loop)
    private static void loop() {

        int workWeekDays = 5;

        //erster Schritt i=0
        for (int i = 0; i < workWeekDays; i++) {
            System.out.println("-----------------------");
            System.out.println("New Day");
            System.out.println("Wake up at 6 a.m.");
            System.out.println("Go to Work at 8 a.m.");
            System.out.println("Get Home at 6 p.m.");
            System.out.println("Need to watch Netflix");
            System.out.println("Go to the Neighbor");
            System.out.println("Get Home");
            System.out.println("Go to Sleep");
        }
    }
}
