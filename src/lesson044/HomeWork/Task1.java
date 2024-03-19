/*
 * created by max$
 */


package lesson044.HomeWork;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
                /*
Ваша задача используя классы пакета java.io создать файл с именем 'copy1.txt' и скопировать в
него все данные из файла 'text.txt'
                 */
        File path1= new File("src/lesson044/HomeWork/text.txt");
        File path = new File("src/lesson044/HomeWork");
        path.mkdirs();

        File file = new File(path, "copy.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
               bufferedWriter.write(line);
               bufferedWriter.newLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
