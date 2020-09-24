package day03;

public class IntToDouble {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2; //expect 2

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5; //expect 2.5
        double var7 = var1 / var2;  //2.0

        double var8 = var1 / var4; //expect 1.0

        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

        int var9= (int) (var1/var4);
        System.out.println(var9);
    }
}
