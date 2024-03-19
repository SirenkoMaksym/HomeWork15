/*
 * created by max$
 */


package lesson044.HomeWork;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        /*
Данные в виде: <имяПользователя>:<суммаПоступления>.
Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
Output:

less.txt

user2:1950
user3:1800
more.txt:

user1:5050
user4:2100
         */


        File path = new File("src/lesson044/HomeWork/text.txt");
        File path1 = new File("src/lesson044/HomeWork");
        path.mkdirs();
        File more = new File(path1, "more.txt");
        File less = new File(path1, "less.txt");


        File file = new File("copy2.txt");


        try {
            more.createNewFile();
            less.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> users = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                String user = parts[0];
                int translation = Integer.parseInt(parts[1]);
                // Обновляем сумму для текущего пользователя
                users.put(user, users.getOrDefault(user,0) + translation);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
        Map<String, Integer> lessMap = new HashMap<>();
        Map<String, Integer> moreMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : users.entrySet()) {
            String user = entry.getKey();
            int translation = entry.getValue();
            if (translation < 2000) {
                lessMap.put(user, translation);
            } else {
                moreMap.put(user, translation);
            }
        }
        try (BufferedWriter lessWriter = new BufferedWriter(new FileWriter(less));
             BufferedWriter moreWriter = new BufferedWriter(new FileWriter(more))) {
            for (Map.Entry<String, Integer> entry : lessMap.entrySet()) {
                lessWriter.write(entry.getKey() + "|" + entry.getValue());
                lessWriter.newLine();
            }
            for (Map.Entry<String, Integer> entry : moreMap.entrySet()) {
                moreWriter.write(entry.getKey() + "|" + entry.getValue());
                moreWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
