/*
 * created by max$
 */


package lesson045.HomeWork;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Tекущую датa: " + now);
        System.out.println("текущий год: " + now.getYear());
        System.out.println("текущий месяц: " + now.getMonth());
        System.out.println("текущий день года: " + now.getDayOfYear());
        LocalDate date1 = LocalDate.of(1987, 1, 17);
        System.out.println("Мой ДР: " + date1);
        LocalDate data2 = LocalDate.of(1987, Month.FEBRUARY, 1);
        System.out.println("Равны ли даты? " + data2.equals(date1));

        LocalTime now1 = LocalTime.now();
        System.out.println("Текущее время: " + now1);
        System.out.println("Текущее время 3 часа: " + now1.plusHours(3));
        System.out.println("Дата на неделю позже: " + now.plusWeeks(1));
        System.out.println("Дата на год раньше: " + now.minusYears(1));
        System.out.println("Дата на год позже: " + now.plusYears(1));
        LocalDate tomorrow = now.plusDays(1);
        LocalDate yesterday = now.minusDays(1);
        System.out.println("Сегодня после вчера? " + now.isAfter(yesterday) + " Или до? " + now.isBefore(yesterday));
        System.out.println("Сегодня после завтра? " + now.isAfter(tomorrow) + " Или до? " + now.isBefore(tomorrow));


        List<LocalDate> dat = List.of(date1,data2, tomorrow, yesterday);

        System.out.println(langestPeriod(dat));


    }

    public static long langestPeriod(List<LocalDate> time) {

        Optional<LocalDate> dayMax = time
                .stream()
                .max((i, k) -> (int) ChronoUnit.DAYS.between(i, k));
        Optional<LocalDate> dayMin = time
                .stream()
                .min((i, k) -> (int) ChronoUnit.DAYS.between(i, k));


        long day1 = 0;
        if (dayMax.isPresent() && dayMin.isPresent()) {
            day1 = dayMax.get().until(dayMin.get(), ChronoUnit.DAYS);
        } else {
            System.out.println("Чет не то");
        }

        return day1;
    }

}
