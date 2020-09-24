package day04.hw4;
/*1.Найти в интернете таблицы для типа данных char. Проверить, что они действительно соответствуют тому, что выводит Java на экран.
  2.Найти "смешные" символы, символ стандартного смайлика, найти символ телефона, параграфа, копирайта(C), торговой марки(тм), рубля, евро, доллара, знаков зодиака, шахмат, червы.
  3.Вбить в поисковую строку Windows "charmap".
  4.Найдите самостоятельно статьи на тему:

    Что такое юникод?
    Что такое ASCII?
    Что такое UTF?

  5.Что будет, если "сложить" переменную String с самой собой? Можно ли умножить её на саму себя? Почему?
  6.Вывести на экран сообщение в кавычках. Например собственное имя + "профессия".
  7.Вывести на экран построчно анкетные данные: Имя, Фамилия, Адрес, Улица и тд и тп. Пример вывода одной строчки:*/

public class hw4 {
    public static void main(String[] args) {


        String s1, s2, s3, s4, s5;
        s1 = "Anton";//Name
        s2 = "Haustov";//Surname
        s3 = "Pritzwalker Str.6"; //Street
        s4 = "Berlin"; //Town
        s5 = "Barkeeper"; //Job

        hw2();
        //  hw5();

        hw6(s1, s2, s5);
        hw7(s1, s2, s3, s4);
    }

    private static void hw6(String a, String b, String c) {
        // \" or \u0022 = "

        System.out.println(a + "\u0020" + b + "\t" + "\"" + c + "\"");
    }

    private static void hw7(String s1, String s2, String s3, String s4) {

        //u0020 = Space ; \t =Tabulator ; \n = Next Row
        System.out.println(s1 + "\u0020" + s2 + "\n" + s3 + "\n" + s4);
    }

    private static void hw5() {

        String s1, s2, s3;
        s1 = "\u0061";
        s2 = "\u0062";
        // s3= s1*s2; Bad Operand
        s3 = s1 + s2;
        System.out.println(s3);
    }

    private static void hw2() {
        char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13;
        
        c1 = 58; //  :
        c2 = 41; //  )
        c3 = 9; // Tabulator
        c4 = 9742; //u260E Telefon
        c5 = 167; //u00A7 Paragraph
        c6 = 169; //u00A9 Copyright
        c7 = 8482; // Trademark
        c8 = '\u20BD';//  Rubel
        c9 = '\u20AC';//Euro
        c10 = '\u0024';//Dollar
        c11 = 9802;//Sternzeichen
        c12 = 9819;//Schach
        c13 = 10085;//Herzen


        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c4);
        System.out.print(c5);
        System.out.print(c6);
        System.out.print(c7);
        System.out.print(c8);
        System.out.print(c9);
        System.out.print(c10);
        System.out.print(c11);
        System.out.print(c12);
        System.out.println(c13);

    }
}
