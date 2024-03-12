/*
 * created by max$
 */


package lesson039.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> map = new HashMap<>();
        String withoutPunchSymbols = text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        char[] chars = withoutPunchSymbols.toCharArray();
        for (char ch : chars)
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        return map;
    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        Map<String, Integer> map = new HashMap<>();
        String withoutPunchSymbols = text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] words = withoutPunchSymbols.split("\\s+");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }

        }
        return map;
    }
}