/*
 * created by max$
 */


package lesson040.Homework;

import lesson040.StreemExample;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    /*
    Дан список строк. Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву
    (например, "A"), удалите дубликаты и отсортируйте их в алфавитном порядке.
     */
    public static void main(String[] args) {

        List<String> strings = List.of("Obama", "Biden", "Tramp", "Klinton", "Bush", "Barbara");
        List<String> filtredStrings = strings.stream()
                .filter(string -> string.startsWith(String.valueOf('B')))
                .distinct()  //.distinct(): Эта операция применяется к потоку элементов и удаляет все дубликаты, оставляя
                             // только уникальные элементы. Это может быть полезно, если вы хотите избавиться от
                             //повторяющихся значений в потоке данных.
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filtredStrings);
    }
}
