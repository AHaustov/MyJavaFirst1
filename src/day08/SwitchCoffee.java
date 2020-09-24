package day08;

public class SwitchCoffee {
    public static void main(String[] args) {

        int button = 5; //number in CoffeeMachine

        vendingMachine(button);
    }

    public static void coffeeWithMilk(){
        System.out.println("Water boiling");
        System.out.println("Grinding Coffee");
        System.out.println("Adding Cream");

    }

    private static void vendingMachine(int customerChoose) {
        switch (customerChoose) {
            case 1:
                System.out.println("Cafe Americano");
                break;
            case 2:
                System.out.println("Hot Water");
                break;
            case 3:
                System.out.println("Espresso");
                break;
            case 4:
                System.out.println("Cacao");
                break;
            case 5:
                coffeeWithMilk();
                break;
            default:
                System.out.println("Change your choose "+customerChoose+
                        ",because it is temporarly not available");
                break;
        }
        System.out.println("There were no Errors");
    }
}
