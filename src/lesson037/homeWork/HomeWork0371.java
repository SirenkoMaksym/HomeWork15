/*
 * created by max$
 */


package lesson037.homeWork;

import java.util.*;

public class HomeWork0371 {
    public static void main(String[] args) {
/*

Создайте 4 метода, принимающий реализацию интерфейса List.



Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
Сравните для каждого из списка время выполнения каждого метода.
И сравните время последовательного выполнения всех методов для каждой реализации List-а.

 */
        //Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            int value = random.nextInt(1000);
            arrayList.add(value);
            linkedList.add(value);
        }

        // Получение всех значений элементов списка по его индексу
        long x = System.currentTimeMillis();
        getAllByIndex(arrayList);
        System.out.println(arrayList);
        long y = System.currentTimeMillis();
        System.out.println("arrayList get allbyIndex : " + (y - x));

        long i = System.currentTimeMillis();
        getAllByIndex(linkedList);
        System.out.println(linkedList);
        long k = System.currentTimeMillis();
        System.out.println("linkenList get allbyIndex : " + (k - i));


        // Вставка 2000 новых значений по случайному индексу
        long x1 = System.currentTimeMillis();
        insertRandomValues(arrayList);
        long y1 = System.currentTimeMillis();
        System.out.println("arrayList insertRandom : " + (y1 - x1));


        long i1 = System.currentTimeMillis();
        insertRandomValues(linkedList);
        long k1 = System.currentTimeMillis();
        System.out.println("linkedList InsertRandom : " + (k1 - i1));


        // Удаление 1000 элементов по случайному индексу
        long x2 = System.currentTimeMillis();
        removeRandomIndex(arrayList);
        long y2 = System.currentTimeMillis();
        System.out.println("arrayList removeRandomIndex: " + (y2 - x2));


        long i2 = System.currentTimeMillis();
        removeRandomIndex(linkedList);
        long k2 = System.currentTimeMillis();
        System.out.println("linkedList removeRandomIndex: " + (k2 - i2));

        // Удаление 1000 элементов по значению
        long x3 = System.currentTimeMillis();
        removeRandomValues(arrayList);
        long y3 = System.currentTimeMillis();
        System.out.println("arrayList removeRandomValues: " + (y3 - x3));

        long i3 = System.currentTimeMillis();
        removeRandomValues(linkedList);
        long k3 = System.currentTimeMillis();
        System.out.println("linkedList removeRandomValues: " + (k3 - i3));


        System.out.println("Сумма времени ArrayList: " + ((y - x)+ (y1 - x1)+ (y2 - x2)+ (y3 - x3)));
        System.out.println("Сумма времени linkedList: " + ((k - i)+(k1 - i1)+(k2 - i2)+(k3 - i3)));

    }

    //В первом методе - получение всех значений элементов списка по его индексу
    public static void getAllByIndex(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
        }
    }

    //Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    public static void insertRandomValues(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 2000; i++) {
            int index = random.nextInt(list.size());
            int valueLuck = random.nextInt(1000);
            list.add(index, valueLuck);
        }
    }

    //Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
    public static void removeRandomIndex(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
    }

    //Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000), но я сделал до 5 т.к. падает при 10000
    public static void removeRandomValues(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(5000);
            list.remove(value);
        }
    }
}
