/*
 * created by Max$
 */
/*
Создайте класс Calculator, который будет предоставлять базовые арифметические операции:
сложение, вычитание, умножение и деление.

Класс должен содержать: Статические методы для каждой операции,
принимающие два аргумента и возвращающие результат операции.
 */

package lesson18_01;

public class Calculator {

    private static double summa(double x, double y) {
        double summa;
        summa = x + y;
        return summa;
    }

    public static double substraction(double x, double y) {
        double subst = x - y;
        return subst;
    }

    public static double multiplication(double x, double y) {
        double mult = x * y;
        return mult;
    }
    public static double division(double x, double y){
        double div  = 0;
        if ( y == 0 ){
            System.out.println("Это же бесконечность!");
        }
            return x / y;
    }

    public static void main(String[] args) {
        division(10,3);
        System.out.println(division(10,2));
    }
}
