package training;

public class PresentationOutPrintF {
    public static void main(String[] args) {

        String input = "Hello i´m Blue";
        String input2 = "           ";
        System.out.printf("\033[34m%s\033[0m", input);
        System.out.printf("\033[44m%s\033[0m", input2);
    }
}
