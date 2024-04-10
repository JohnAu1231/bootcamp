package localedate;

import java.time.LocalDate;

public class HKlocalDate {
  
  private LocalDate date;

  public HKlocalDate(int year, int month, int day) {
    this.date = LocalDate.of(year, month, day);
  }

  public HKlocalDate tomorrow() {
    this.date = this.date.plusDays(1);
    return this;
  }

  public String toString() {
    return this.date.getYear() + "," //
    + this.date.getMonthValue() + "," //
    + this.date.getDayOfMonth();
  }

  public static HKlocalDate now() {
    int year = LocalDate.now().getYear();
    int month = LocalDate.now().getMonthValue();
    int day = LocalDate.now().getDayOfMonth();
    return new HKlocalDate(year, month, day);
  }

  public static void main(String[] args) {
    HKlocalDate day = new HKlocalDate(2024,03,05);
    System.out.println(day.toString());
    System.out.println(new HKlocalDate(2024,03,05));
  }

}
