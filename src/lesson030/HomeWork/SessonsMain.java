/*
 * created by max$
 */


package lesson030.HomeWork;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SessonsMain {

    public static int middleTemp(String inputSessons) {

        int juni = 25;
        int juli = 30; //
        int august = 28;

        int september = 20;
        int oktober = 10;
        int november = 5;

        int december = 2;
        int january = -5;
        int february = -12;

        int march = 10;
        int april = 15;
        int may = 20;



        if (inputSessons.equals(Sessons.SUMMER.toString())) {
            int summer = (juli + juni + august) / 3;
            System.out.println(Sessons.SUMMER.getMiddleTempRussian() + summer);
            return summer;
        } else if (inputSessons.equals(Sessons.SPRING.toString())) {
            int spring = (march + april + may) / 3;
            System.out.println(Sessons.SPRING.getMiddleTempRussian() + spring);
            return spring;
        } else if (inputSessons.equals(Sessons.WINTER.toString())) {
            int winter = (december + january + february) / 3;
            System.out.println(Sessons.WINTER.getMiddleTempRussian() + winter);
            return winter;
        } else if (inputSessons.equals(Sessons.AUTUMN.toString())) {
            int autumn = (september + oktober + november) / 3;
            System.out.println(Sessons.AUTUMN.getMiddleTempRussian() + autumn);
            return autumn;
        } else {
            System.out.println("Введите верно, большими английскими буквами!");
        }return 0;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нужное время года: ");
        String inputSessons = scanner.next();

        middleTemp(inputSessons);

        scanner.close();
    }

}
