package lesson17_01;

//Написать класс Employee (Работник)
public class Employee {
    //У него должны быть поля имя, возраст, зарплата
    private String name;
    private int age;
    private int gehalt;


    //Начинаю гетерить. Инкапсулировать класс, часть 1.
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getGehalt() {
        return this.gehalt;
    }

    //Начинаю сетерить. Инкапсулировать класс, часть 2.
    public void setName(String name) {
        if (name == null) {
            this.name = "Забыл имя!";
            System.out.println("Забыл имя!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 14) {
            this.age = age;
        } else {
            this.age = age;
            System.out.println("Детям нельзя работать, по-крайней мере официально...");
        }
    }

    public void setGehalt(int gehalt) {
        if (gehalt >= 12.41) {
            this.gehalt = gehalt;
        } else {
            this.gehalt = gehalt;
            System.out.println("Слишком мало для этой страны!");
        }
    }

    //Написать метод info() выводящий информацию о работнике.
    public void infoEmployee() {
        Employee employee = new Employee();
        System.out.println("Нашего работника зовут: " + getName()
                + " Вoзвраст: " + getAge() + " Зарплата в час: "
                + getGehalt());

    }

}
