package day16;

public class ClassWork16 {
    public static void main(String[] args) {
       /* System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43));// → false
        System.out.println(shareDigit(12, 44));// → false*/
        /*System.out.println(squirrelPlay(70, false));// → true
        System.out.println(squirrelPlay(95, false));// → false
        System.out.println(squirrelPlay(95, true));// → true*/
        /*System.out.println(alarmClock(1, false));// → "7:00"
        System.out.println(alarmClock(5, false));// → "7:00"
        System.out.println(alarmClock(0, false));// → "10:00"
        System.out.println(alarmClock(0, true));// → "off"*/
        /*System.out.println(specialEleven(22));// → true
        System.out.println(specialEleven(23));// → true
        System.out.println(specialEleven(24));// → false*/
        /*System.out.println(less20(18));// → true
        System.out.println(less20(19));// → true
        System.out.println(less20(20));// → false*/
        System.out.println(answerCell(false, false, false));// → true
        System.out.println(answerCell(false, false, true));// → false
        System.out.println(answerCell(true, false, false));// → false
    }

    private static boolean answerCell(boolean morning, boolean mama, boolean asleep) {
        if (asleep) {
            return false;
        } else if (morning && !mama){
            return false;
        }
        return true;
    }

    private static boolean less20(int a) {
        return a % 20 == 19 || a % 20 == 18;
    }

    private static boolean specialEleven(int a) {
        return a % 11 == 0 || a % 11 == 1;
    }

    private static String alarmClock(int day, boolean vacation) {
        String alarm = "";
        if (vacation && (day <= 6 && day >= 0)) {
            alarm = "off";
        } else if (day == 6 || day == 0 || vacation) {
            alarm = "10:00";
        } else {
            alarm = "7:00";
        }
        return alarm;
    }

    private static boolean squirrelPlay(int temperature, boolean summer) {
        int min = 60;
        int max = 90;
        if (summer) {
            max += 10;
        }
        if (temperature >= min && temperature <= max) {
            return true;
        }
        return false;
    }

    private static boolean shareDigit(int one, int two) {
        int a1 = one / 10;
        int a2 = one % 10;
        int b1 = two / 10;
        int b2 = two % 10;
        return a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2;
    }
}
