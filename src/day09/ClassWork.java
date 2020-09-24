package day09;

public class ClassWork {
    public static void main(String[] args) {

        int speed= 131;
        
        if (speed <=50){
            System.out.println("Keine Strafe");
        }else if(speed<=65){
            System.out.println("Musst 5 Minuten warten");
        }else if (speed<=100){
            System.out.println("Strafe ist 40€");
        }else if (speed<=130){
            System.out.println("Strafe ist 500€");
        }else{
            System.out.println("Führerschein ist weg!");
        }
        
    }
}
