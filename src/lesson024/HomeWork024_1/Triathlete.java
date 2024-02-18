/*
 * created by max$
 */


package lesson024.HomeWork024_1;

public class Triathlete implements Runner, Swimmer {

    private String name;

    public Triathlete(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(name + " Бегу!");
    }

    @Override
    public void swim() {
        System.out.println(name + " Плыву!");
    }

    public static void main(String[] args) {
        Triathlete triathlete = new Triathlete("Bob");
        triathlete.run();
        triathlete.swim();
    }
}
