/*
 * created by max$
 */


package lesson040.Homework;

import java.util.function.BiConsumer;

public class Task3 {
    /*
    BiConsume Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
     */
    public static void main(String[] args) {
        BiConsumer<String, Integer> printBiConsumer = (t, intq) -> System.out.println(t + "=" + intq);
        printBiConsumer.accept("Ключ", 15);
    }
}
