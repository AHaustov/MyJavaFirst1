package day06;

public class HelloString2 {
    public static void main(String[] args) {
        String poema="sfmadkfmakdmwdfwf";
        int länge= poema.length();//Abfrage der Stringlänge
        System.out.println(länge);

        String preview=poema.substring(0,10);// erste 10 Zeichen
        System.out.println(preview);

        String end=poema.substring(länge-10);//letzte 10 Zeichen
        System.out.println(end);
        char test= poema.charAt(0);
        System.out.println(test);
        char test2=poema.charAt(länge-1);
        System.out.println(test2);
        System.out.println(poema.codePointAt(2));
        char c3=109;
        System.out.println(c3);
    }
}
