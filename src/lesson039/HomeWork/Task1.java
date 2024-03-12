/*
 * created by max$
 */


package lesson039.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /*
    Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
     где каждому слову соответствует количество его вхождений в текст.
     */


    // Без подсказки поменять интежер и стрингу(как ключ и значение), было не понятно нихрена!!!
    public static Map<String, Integer> worteBuch(String string){
        Map<String, Integer> map = new HashMap<>();
        String withoutPunchSymbols = string.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
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

    public static void main(String[] args) {
        String string = "Здесь я хотел проверить код, как работает код, код работает не плохо, я доволен!!!";
        Map<String, Integer> map = worteBuch(string);
        System.out.println(map);

    }
}