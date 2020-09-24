package day08.hw8;
/*Напишите программу действий кассира магазина, если у него пытаются купить алкоголь следующие 5 покупателей:
10 лет, 17 лет, 18 лет, 20 лет и 30 лет.*/

public class HomeWork8 {
    public static void main(String[] args) {

     //   int ageCustomer = 21;

       // System.out.println(olderThan18(ageCustomer));
        System.out.println(olderThan18(10));
        System.out.println(olderThan18(17));
        System.out.println(olderThan18(18));
        System.out.println(olderThan18(20));
        System.out.println(olderThan18(30));

    }

  /*  private static boolean olderThan18(int a) {
        return a <=18;
    }*/

    private static String olderThan18(int age) {
        String result = "";

        switch (age) {

            case 0:
                result = "no Alcohol";
                break;
            case 1:
                result = "no Alcohol";
                break;
            case 2:
                result = "no Alcohol";
                break;
            case 3:
                result = "no Alcohol";
                break;
            case 4:
                result = "no Alcohol";
                break;
            case 5:
                result = "no Alcohol";
                break;
            case 6:
                result = "no Alcohol";
                break;
            case 7:
                result = "no Alcohol";
                break;
            case 8:
                result = "no Alcohol";
                break;
            case 9:
                result = "no Alcohol";
                break;
            case 10:
                result = "no Alcohol";
                break;
            case 11:
                result = "no Alcohol";
                break;
            case 12:
                result = "no Alcohol";
                break;
            case 13:
                result = "no Alcohol";
                break;
            case 14:
                result = "no Alcohol";
                break;
            case 15:
                result = "no Alcohol";
                break;
            case 16:
                result = "no Alcohol";
                break;
            case 17:
                result = "no Alcohol";
                break;

            default:
                result = " Thank You Sir";
                break;
        }
            return result; }
    }


