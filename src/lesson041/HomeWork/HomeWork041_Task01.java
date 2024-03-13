/*
 * created by max$
 */


package lesson041.HomeWork;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork041_Task01 {
    /*
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения по значению
последней цифры в числе и выведите результат на экране
     */
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 5, 7, 8, 99, 0, 5, 3, 5, 66, 78, 23, 334, 564, 7865, 444, 765);
        List<Integer> integerList = integers
                .stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparing(i -> i % 10))
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
