/*
 * created by Max$
 */

package lesson18_01;

import javax.sound.midi.Soundbank;

public class Co6aka {
private String name;
private double hochSpringen;

    public Co6aka(String name, double hochSpringen) {
        this.name = name;
        this.hochSpringen = hochSpringen;
    }

    private void springCobaka(double hochSpringen){
        System.out.println("Гав! Я Прыгаю! Прыжек на: " + hochSpringen);
    }
    private double trenningCo6aka(int countTrennig){
        double maxSpringen = hochSpringen;
        if (countTrennig <= 0){
            System.out.println("Я не могу тренироваться вспять! Гав!");
        }else {
            for (int i = 0; i < countTrennig; i++) {
                hochSpringen += 0.1;
            }
        }
        if (maxSpringen*2 >= hochSpringen){
            maxSpringen = hochSpringen;
        }else {
            hochSpringen = maxSpringen*2;
        }

        return hochSpringen;
    }

    private void barier(double hochBarier){
        double maxSpring2 =  hochSpringen*2;
        if (hochBarier <= hochSpringen){
            System.out.println("ГАВ! Прыгаю!!!");
        }else if(maxSpring2 > hochBarier){
            for (int i = 1; hochSpringen < hochBarier; i++) {
                trenningCo6aka(i);

            }
        System.out.println("Я натренировался и теперь прыгну на " + hochSpringen);
        }else{
            System.out.println("Это нереально! Ищи кенгуру!");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHochSpringen() {
        return hochSpringen;
    }

    public void setHochSpringen(double hochSpringen) {
        this.hochSpringen = hochSpringen;
    }

    public static void main(String[] args) {
        Co6aka dog = new Co6aka("Bobik", 1.1);
        dog.barier(2);
    }
}
