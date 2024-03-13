/*
 * created by max$
 */


package lesson041.HomeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.max;

public class HomeWork_Task02 {
    //Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.
    public static void main(String[] args) {
        List<String> stringList = List.of("Java", "Python", "Dell", "Google is Cool");
        Optional<String> stream = stringList
                .stream()
                .max((name1, name2) -> name1.length() - name2.length());
        if (stream.isPresent()) {
            System.out.println(stream.get());
        } else {
            System.out.println("Ne naydeno");
        }

    }
}
