package day15;

public class LovelyLeapYears {
    public static void main(String[] args) {
        printLeapYears(2000,2009);

    }

    private static void printLeapYears(int years1, int years2) {
        for (int i = years1; i <=years2; i++) {
            if(cheackLeapYear(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean cheackLeapYear(int year){
        return year%400==0||year%4==0^year%100==0;
    }
}
