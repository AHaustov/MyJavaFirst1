package day16;

public class day16 {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");


    }

  private static void enigmaCaesar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.codePointAt(i) < 65){
                result +=(char) (str.codePointAt(i));
            }else if(str.codePointAt(i) >1100){
                result +=(char) (str.toUpperCase().codePointAt(i)+3);
            }else{
                result +=(char) (str.codePointAt(i)+3);
            }

        }
        System.out.println(result);
    }
}
