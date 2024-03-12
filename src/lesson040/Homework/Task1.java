/*
 * created by max$
 */


package lesson040.Homework;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-1, 3, 4, 0, 34, -45, 11));
        System.out.println(filterInteger(list));

    }
    /*
    Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список. Используйте несколько
     предикатов для фильтрации списка чисел, где числа должны быть четными, больше 10 и меньше 100
     */

    public static List<Integer> filterInteger(List<Integer> integers) {
        List<Integer> list = new ArrayList<>();
        Predicate<Integer> isHonest = integer -> integer % 2 == 0;
        Predicate<Integer> isMore10 = integer -> integer > 10;
        Predicate<Integer> isLess = integer -> integer < 100;
        for (Integer intq : integers) {
            if (isHonest.test(intq) && isLess.test(intq) && isMore10.test(intq)){
                list.add(intq);
            }
        }return list;
    }
}
