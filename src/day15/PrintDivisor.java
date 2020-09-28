package day15;

public class PrintDivisor {
    public static void main(String[] args) {
        printDivisors(32);
    }

    private static void printDivisors(int a) {
        int n=0;
        for (int i = a; i >=1 ; i--) {

            if(a%i==0){
                n++;
                System.out.println(i);
            }
        }
        System.out.println("Total Divisor number is "+n);
    }
}
