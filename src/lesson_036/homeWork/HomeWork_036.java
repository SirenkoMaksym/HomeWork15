/*
 * created by max$
 */


package lesson_036.homeWork;

import util.MyArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class HomeWork_036 {
    public static void main(String[] args) {

        /*
        Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки
         массива целых чисел в следующем порядке: Четные целые числа должны идти перед нечетными
         числами
*/

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        Arrays.sort(integers, (ints1, ints2) -> {

            if (ints1 % 2 == 0 && ints2 % 2 != 0) {
                return -1;
            } else if (ints1 % 2 != 0 && ints2 % 2 == 0) {
                return 1;
            } else {
                return ints1.compareTo(ints2);
            }

        });

        System.out.println(Arrays.toString(integers));


        Integer[] integers1 = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0 && o2 % 2 != 0) return -1;
                if (o1 % 2 != 0 && o2 % 2 == 0) return 1;
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(Arrays.toString(integers1));

        /*
        Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
           Четные целые числа должны идти перед нечетными числами в порядке возрастания.
           Нечетные целые числа должны идти после четных в порядке убывания
           [2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
         */

        Integer[] integers3 = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        Arrays.sort(integers3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0 && o2 % 2 == 0) {
                    return o1.compareTo(o2);
                } else if (o1 % 2 != 0 && o2 % 2 != 0) {
                    return o2.compareTo(o1);
                } else if (o1 % 2 == 0 && o2 % 2 != 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        System.out.println(Arrays.toString(integers3));

    }
}
