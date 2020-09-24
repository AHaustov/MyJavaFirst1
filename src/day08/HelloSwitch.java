package day08;

public class HelloSwitch {
    public static void main(String[] args) {

        int schoolNote = 2;
        //       System.out.println(schoolNote);

        System.out.println(bonus(schoolNote));
    }

    private static String bonus(int note) {
        String output = "";

        switch (note) {

            case 5:
                output = "Bicycle";
                break;
            case 4:
                output = "GoPro7";
                break;
            case 3:
                output = "No Bonus";
                break;
            case 2:
                output = "Lost time and bad mood";
                break;
            case 1:
                output = "Don´t ask";
                break;
            default:
                output = "That doesn´t exist";
                break;
        }


        return output;

    }
}
