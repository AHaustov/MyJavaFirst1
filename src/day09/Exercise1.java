package day09;

public class Exercise1 {
    public static void main(String[] args) {


      //  System.out.println("Endergebnis "+sum(2, 4));
        System.out.println("Endergebnis "+sum(0, 10));
    }

    private static int sum(int a,int b) {
        int result=0;
        for (int i = a; i <=b ; i++) {
            result+=i;
            System.out.println("Zwischenergebnis "+result);
        }
        return result;
    }
}
