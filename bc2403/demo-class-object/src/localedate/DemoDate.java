package localedate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class DemoDate {
  public static void main(String[] args) {
    LocalDate day = LocalDate.of(2023, 12, 1);
    System.out.println(day.toString()); // 2023-12-01

    LocalDate day2 =LocalDate.parse("2023-12-01");
    System.out.println(day2.toString()); // 2023-12-01

    System.out.println(day == day2); // false
    System.out.println(day.compareTo(day2)); //0
    System.out.println(day.isEqual(day2)); // true
    System.out.println(day.getDayOfMonth()); // 1
    System.out.println(day.getDayOfYear()); //335
    System.out.println(day.getDayOfWeek().toString()); //FRIDAY
    System.out.println(day.getMonthValue()); //12
    System.out.println(day.getYear()); //2023
    System.out.println(day.lengthOfMonth()); //31
    System.out.println(day.lengthOfYear()); //365
    System.out.println(day.plusDays(5).toString()); // 2023-12-06
    System.out.println(day.plusMonths(2).toString()); // 2024-02-01
    System.out.println(day.plusWeeks(3).toString());  // 2023-12-22
    System.out.println(day.isAfter(LocalDate.of(2023, 11, 20))); // true
    System.out.println(day.isBefore(day2));// false

    int year = day.getYear();
    Month month = day.getMonth();
    System.out.println(month.length(false)); //31
    System.out.println(Month.of(2).length(false));
    System.out.println(Month.of(2).length(true));
    Year year2 = Year.of(2024);
    System.out.println(year2.isLeap());
    LocalDate today = LocalDate.now();
    System.out.println(today);
    


  }
}
