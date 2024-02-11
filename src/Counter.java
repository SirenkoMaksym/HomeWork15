/*
 * created by Max$
 */
/*
Класс "Счётчик" Разработайте класс Counter, который позволяет создавать объекты-счётчики с
 возможностью увеличения и уменьшения значения счётчика. В классе должны быть:
Поле value для хранения текущего значения счётчика.
Методы increment() и decrement(), увеличивающие и уменьшающие значение счётчика соответственно.
Метод getValue() для получения текущего значения счётчика.
 */

public class Counter {

        int value;


    public Counter(int value) {
        this.value = value;
    }

    private int inkrement(){
        value++;
        return value;
    }
    private int decrement(){
        value--;
        return value;
    }
    private int getValue(){
        System.out.println("Текущее значение " + value);
        return value;
    }

    public static void main(String[] args) {
        Counter counter= new Counter(5);
        counter.decrement();
        counter.getValue();
        Counter counter1 = new Counter(7);
        counter1.getValue();
        counter.getValue();

    }



}
