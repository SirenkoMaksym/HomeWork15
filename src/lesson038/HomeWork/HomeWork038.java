/*
 * created by max$
 */


package lesson038.HomeWork;

import org.junit.platform.commons.util.StringUtils;

import java.util.*;

/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в
порядке увеличения длин слов. Если строки имеют одинаковую длину - сортировать в естественном порядке
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
public class HomeWork038 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления";
        System.out.println(getUniqueSortedWords(testString));
    }

    public static List<String> getUniqueSortedWords(String strings) {
        List<String> list = new ArrayList<>(); /// создаем новый арраулист
        StringBuilder word = new StringBuilder();
        char[] chars = strings.toCharArray(); // закидываем нашу строку в массив чаров
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                word.append(c);
                //    System.out.println(c); перебираем чары и слепляим их, если эти чары есть буквы в слова
            } else {
                if (word.length() > 0) {
                    list.add(word.toString());
                    word.setLength(0);
                    // если слово получилось, то добавляем его к нам в лист, прям стрингой. и обнуляем.
                }
            }}

            Set<String> wordOhneWieder = new TreeSet<>(list); // создаем новый Сет, с сортировкой и запихиваем
            // в него получившийся лист, походу уничтожая копии
            List<String> newWordsList = new ArrayList<>(wordOhneWieder); //создаем новый лист куда идут последние слова

            newWordsList.sort(Comparator.comparing(String::length));// сортировка по длине

            return newWordsList; //вовзврат листа... как делать лист смотрел в инете(
        }
    }
