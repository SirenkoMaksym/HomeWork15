/*
 * created by max$
 */


package lesson044;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {


        // Создаем директорию, если её нет
        File pathDir = new File("src/lesson044/task1");
        pathDir.mkdirs();


        for (int i = 1; i <= 11; i++) {
            File fileName = new File(pathDir, "test" + i + ".txt");
           try(FileWriter writer = new FileWriter(fileName)) {
               fileName.createNewFile();
               writer.write("Java" + i);
               System.out.println("Запись успешно " + fileName);
           } catch (IOException e) {
               e.printStackTrace();
           }
        }


        File[] files = pathDir.listFiles();

        for (File file: files){
            try (BufferedReader bReader = new BufferedReader(new FileReader(file))) {
                String line = bReader.readLine();
                if (line != null && line.contains("Java7")){
                    System.out.println("Файл найден: "+ file.getName());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } ;
        }

    }
}
