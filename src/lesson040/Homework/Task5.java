/*
 * created by max$
 */


package lesson040.Homework;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    /*
    Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
    которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
     */
    private static List<Person> getListPerson() {
        return List.of(
               new Person("Bob", "Las-Vegas", 25),
               new Person("Mike", "Los Angeles", 35),
               new Person("Charly", "Las-Vegas", 15),
               new Person("Luna", "New York CITY",50),
               new Person("Karol", "Las-Vegas", 90),
               new Person("Chandler", "Los Angeles", 58)
        );
    }

    public static void main(String[] args) {
        task5();
    }

    private static void task5() {
        List<Person> people = getListPerson();
        List<String> stringStream = people
                .stream()
                .filter(person -> person.getAge() > 20)
                .filter(person -> person.getCity().equals("Las-Vegas"))
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(stringStream);
    }
}
