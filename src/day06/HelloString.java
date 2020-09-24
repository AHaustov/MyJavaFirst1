package day06;

public class HelloString {
    public static void main(String[] args) {

        String student1,student2;
        student1="Elena Preskrasnya";
        student2="Ivan Durak";

     //   final double MY_PI=Math.PI;


        helloUser(student1);
        helloUser(student2);
        helloUser("Andrey");

        char c1=150;
        char c2= (char) (c1+20);
        System.out.println(""+c1+10);
        System.out.println(c2);
    }

    private static void helloUser(String username) {
        System.out.println("Hello "+username+"!");
    }
}
