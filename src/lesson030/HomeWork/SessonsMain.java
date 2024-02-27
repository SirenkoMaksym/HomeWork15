/*
 * created by max$
 */


package lesson030.HomeWork;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SessonsMain {

    public static int middleTemp(String inputSessons) {

        if (inputSessons.equals(Sessons.SUMMER.toString())) {
            System.out.println(Sessons.SUMMER.getMiddleTempRussian()+ Sessons.SUMMER.getMiddleTemp());

        } else if (inputSessons.equals(Sessons.SPRING.toString())) {

            System.out.println(Sessons.SPRING.getMiddleTempRussian() + Sessons.SPRING.getMiddleTemp());

        } else if (inputSessons.equals(Sessons.WINTER.toString())) {

            System.out.println(Sessons.WINTER.getMiddleTempRussian() + Sessons.WINTER.getMiddleTemp());

        } else if (inputSessons.equals(Sessons.AUTUMN.toString())) {

            System.out.println(Sessons.AUTUMN.getMiddleTempRussian() + Sessons.AUTUMN.getMiddleTemp());

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
