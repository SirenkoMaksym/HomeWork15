/*
 * created by max$
 */


package lesson042.HomeWork;

import lesson042.groupBy.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork042_task1 {
    /*
Дан список сотрудников (Employee) с полями name, department, salary. Используя Stream API, сгруппируйте сотрудников по отделам
     */
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, 25, "developer", "IT"),
                new Employee("Silvia", 1500, 22, "trainee", "IT"),
                new Employee("Stefan", 2500, 30, "PM", "IT"),
                new Employee("Olivia", 2700, 25, "manager", "Management"),
                new Employee("Sebastian", 3500, 25, "chef", "Management"),
                new Employee("Hanna", 1300, 25, "Cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));

        Map<String, Double> map = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map);
        //   найдите отдел с максимальной средней зарплатой.
        String department = null;
        double maxMitteSalary = 0;

        for (String department1 : map.keySet()) {
            double mitteSalary = map.get(department1);
            if (mitteSalary > maxMitteSalary) {
                department = department1;
                maxMitteSalary = mitteSalary;
            }
        }
        System.out.println(department + ": "+ maxMitteSalary);
    }

    private static void task2() {
        List<Transaction> transactions = new ArrayList<>(List.of(
                new Transaction(10.05, 500, Type.CREDIT),
                new Transaction(11.35, 1500, Type.CREDIT),
                new Transaction(12.15, 223, Type.DEBIT),
                new Transaction(13.45, 300, Type.CREDIT),
                new Transaction(15.55, 5500, Type.DEBIT),
                new Transaction(16.05, 400, Type.CREDIT)
        ));
        //вычислите общую сумму для дебетовых и кредитных транзакций отдельно, а также найдите транзакцию с максимальной суммой.
        Map<Type, Integer> map = transactions
                .stream()
                .collect(Collectors.groupingBy(Transaction::getType, Collectors.summingInt(Transaction::getAmount)));
        System.out.println(map);

        Optional<Transaction> transactions1 = transactions
                .stream()
                .reduce((i1, i2) -> (i1.getAmount()) > i2.getAmount() ? i1 : i2);

        System.out.println(transactions1.orElse(null));
    }

    private static void task1() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, 25, "developer", "IT"),
                new Employee("Silvia", 1500, 22, "trainee", "IT"),
                new Employee("Stefan", 2500, 30, "PM", "IT"),
                new Employee("Olivia", 2700, 25, "manager", "Management"),
                new Employee("Sebastian", 3500, 25, "chef", "Management"),
                new Employee("Hanna", 1300, 25, "Cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));

        Map<String, List<Employee>> map = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(map);
    }
}
