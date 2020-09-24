package day06;

public class ClassWork {
    public static void main(String[] args) {
        String name1, name2, name3;
        name1 = "Bob";
        name2 = "Alice";
        name3 = "X";

        System.out.println(helloName(name1));
        System.out.println(helloName(name2));;
        System.out.println(helloName(name3));
    }

    private static String helloName(String name) {
        return "Hello " + name + "!";
    }



}
