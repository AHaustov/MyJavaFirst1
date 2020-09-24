package day12;
     /*   contains(CharSequence s)
        endsWith(String suffix)
        equals(Object anObject)
        startsWith(String prefix)
        substring(int beginIndex)
        toLowerCase()
        toUpperCase()
        trim()*/

public class hw12 {
    public static void main(String[] args) {

        System.out.println("\n" + "Task" + 1 + "\n" + "------------------------------------" + "\n");

        System.out.println(citiWetterSunday("Minsk"));// -> 24

        System.out.println("\n" + "Task" + 2 + "\n" + "------------------------------------" + "\n");

        System.out.println(citiWetter("Minsk", "friday"));// -> 22

        System.out.println("\n" + "Task" + 3 + "\n" + "------------------------------------" + "\n");
        String example = "Hello";
        System.out.println(containsS(example));//gibt boolean,ob eine Sequenz im String enthalten ist.
        System.out.println(endsWith(example));// gibt boolean, ob String mit einer bestimmten Seuquenz endet
        System.out.println(equalsS(example));// gibt boolean, ob ein Objekt gleich ist
        System.out.println(startsWith(example));//gibt boolean, ob ein String mit einer bestimmten Sequenz beginnt
        System.out.println(subString(example)); //gibt eine Sequenz aus einem String mit angegebenen Indizes
        System.out.println(toLowerCaseS(example));//setzt die Chars auf Kleinschreibung
        System.out.println(toUpperCaseS(example));//setzt die Chars auf Großschreibung
        System.out.println(trimS(example));//entfernt alle Leerzeichen am Anfang und Ende aus einem String

    }

    private static String toUpperCaseS(String str) {
        return str.toUpperCase();
    }

    private static String trimS(String str) {
        String temp = "     " +str + "     " + str+"     " ;
        return temp.trim();
    }

    private static String toLowerCaseS(String str) {
        return str.toLowerCase();
    }

    private static String subString(String str) {
        return str.substring(2, 5);
    }

    private static boolean startsWith(String str) {
        return str.startsWith("Hi");
    }

    private static boolean equalsS(String str) {
        return str.equals("Hello");
    }

    private static boolean endsWith(String str) {
        return str.endsWith("ple");
    }

    private static boolean containsS(String str) {
        return str.contains("llo");
    }

    private static int citiWetter(String city, String weekDay) {
        int day = 0;
        int temperature = 0;
        switch (weekDay.toLowerCase()) {
            case "monday":
                break;
            case "tuesday":
                day += 1;
                break;
            case "wednesday":
                day += 2;
                break;
            case "thursday":
                day += 3;
                break;
            case "friday":
                day += 4;
                break;
            case "saturday":
                day += 5;
                break;
            case "sunday":
                day += 6;
                break;
        }
        switch (city.toLowerCase()) {
            case "berlin":
                temperature = 20 + day;
                break;
            case "london":
                temperature = 17 + day;
                break;
            case "lissabon":
                temperature = 25 + day;
                break;
            case "paris":
                temperature = 23 + day;
                break;
            case "moskau":
                temperature = 19 + day;
                break;
            case "minsk":
                temperature = 18 + day;
                break;
            case "satarow":
                temperature = 15 + day;
                break;
            default:
                System.out.println("I dont know this city");
                break;
        }
        return temperature;

    }

    private static int citiWetterSunday(String city) {
        int temperature = 0;
        switch (city.toLowerCase()) {
            case "berlin":
                temperature = 20 + 6;
                break;
            case "london":
                temperature = 17 + 6;
                break;
            case "lissabon":
                temperature = 25 + 6;
                break;
            case "paris":
                temperature = 23 + 6;
                break;
            case "moskau":
                temperature = 19 + 6;
                break;
            case "minsk":
                temperature = 18 + 6;
                break;
            case "satarow":
                temperature = 15 + 6;
                break;
            default:
                System.out.println("I dont know this city");
                break;
        }
        return temperature;

    }
}
