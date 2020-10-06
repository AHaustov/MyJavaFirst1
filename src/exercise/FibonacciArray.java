package exercise;

public class FibonacciArray {
    public static void main(String[] args) {
        int size = 4; //enter half the size of the fibonacci numbers
        fillFiboArray(size);
    }

    private static void fillFiboArray(int size) {
        int[] fibo1 = new int[size];
        fibo1[0] = 1;
        int[] fibo2 = new int[size];
        fibo2[0] = 1;
        for (int i = 1; i < size; i++) {
            fibo1[i] = fibo1[i - 1] + fibo2[i - 1];
            fibo2[i] = fibo1[i] + fibo2[i - 1];
        }
        System.out.print("[ ");
        for (int i = 0; i < 2*size; i++) {
            if (i % 2 == 0) {
                System.out.print(fibo1[i / 2] + ", ");
            } else {
                System.out.print(fibo2[i / 2]);
               if(i!=2*size-1){
                   System.out.print(", ");
               }else{
                   System.out.println(" ]");
               }
            }
        }
    }
}
