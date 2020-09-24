package day10;

public class day10 {
    public static void main(String[] args) {
      /* multiplicationTable(3);//->
        System.out.println(cigarParty(30, false));// → false
        System.out.println(cigarParty(50, false)); //→ true
        System.out.println(cigarParty(70, true));// → true*/
        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false)); //→ 1
        System.out.println(caughtSpeeding(65, true)); //→ 0

    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if ((speed <= 60) || (speed <= 65) && birthday) {
            return 0;
        } else if ((speed <= 80) || (speed <= 85) && birthday) {
            return 1;
        } else return 2;
    }

    private static boolean cigarParty(int number, boolean weekend) {
        return (40 <= number && number <= 60) && !weekend || (40 <= number) && weekend;
    }

    private static void multiplicationTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "x" + i + "=" + a * i);
        }

    }
}
