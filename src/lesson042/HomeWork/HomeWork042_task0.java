/*
 * created by max$
 */


package lesson042.HomeWork;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class HomeWork042_task0 {
    /*
Разбейте строку на слова, используя в качестве разделителя пробел. Используя функцию reduce верните суммарное
количество букв в словах, которые длиннее 4 символов
// Output:
countLetters: 19
     */
    public static void main(String[] args) {
        String text = "Hello, world and good afternoon";
        int countLetters = countLetters(text);
        System.out.println("countLetters: " + countLetters);

    }

    private static int countLetters(String text) {
        List<String> list = List.of(text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split(" "));
        OptionalInt reduce = list
                .stream()
                .peek(i -> System.out.println(i))
                .filter(i -> i.length() > 4)
                .mapToInt(i -> i.length())
                .reduce((i1, i2) -> i1 + i2);
       return reduce.orElse(0);
    }

}

