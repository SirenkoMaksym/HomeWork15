/*
 * created by max$
 */


package lesson037.homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class HomeWork037 {
    public static void main(String[] args) {
        /*
        Напишите метод, который принимает на вход две реализации интерфейса List.
        Метод должен возвращать список состоящий из элементов, которые присутствуют в обоих коллекциях.
         */
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);


        System.out.println(listZusammen(list,list1));

    }
    public static List<Integer> listZusammen(List<Integer> list ,List<Integer> list1){
           list.retainAll(list1);
        return list;
    }

}