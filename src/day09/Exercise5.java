package day09;

public class Exercise5 {
    public static void main(String[] args) {
        
     //   happyPelmen();
      //  divided3(1,100);
      //  myLine(100);// 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        mySecondLine(1000); // 1 2 4 8 16 32 64 128 256 512

    }

    private static void mySecondLine(int digit) {
        for (int i = 1; i <=digit ; i*=2) {
            System.out.print(i+" ");

        }
    }

    private static void myLine(int i) {

        for (int j = 1; j <=100; j++) {
            if(j%7==0){
                System.out.print(" "+j);
            }

        }
    }

    private static void divided3(int a,int b) {

        for (int i = a; i <=b ; i++) {
            if(i%3==0) {
                System.out.print(" " + i);

            }
        }

    }

    private static void happyPelmen() {
        for (int i = 1; i <=10 ; i++) {
            if (i==5){
                System.out.println("We found HappyPelmen");
                break;
            }

        }
    }
}
