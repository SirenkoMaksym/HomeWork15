/*
 * created by max$
 */


package lesson041.HomeWork;

import java.util.List;
import java.util.stream.Collectors;

public class HomeWork041_Task03 {
    //Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2,
    // и собрать результат в новый список
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 4, 14, 12, 17, 3, 99, 10, -1);
        List<Integer> integerList = integers
                .stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i = (2 * i))
                .collect(Collectors.toList());
        System.out.println(integerList);

    }
}
