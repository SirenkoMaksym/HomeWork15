/*
 * created by max$
 */


package lesson040.Homework;

import java.util.function.Function;

public class Task2 {
    /* Создайте цепочку функций, которая сначала удаляет пробелы из строки, затем преобразует её в верхний регистр,
     и в конце считает количество символов в измененной строке
     */
    public static void main(String[] args) {
        Function<String, String> noSpace = s -> s.replaceAll("\\s", "");
        Function<String, String> toUpperCase = String::toUpperCase;

        Function<String, String> combinedFunc = toUpperCase.andThen(noSpace);
        String result = combinedFunc.apply("Ехали ведмеди на велосипеде!");
        System.out.println(result);

        Function<String, Integer> lengthStr = s -> s.length();
        int length = lengthStr.apply("Ехали ведмеди на велосипеде!");
        System.out.println(length);
    }
}
