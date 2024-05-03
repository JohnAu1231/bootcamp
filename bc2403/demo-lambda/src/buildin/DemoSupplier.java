package buildin;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {

  public static void pirntName(Supplier<Weekday> weekday) {
      System.out.println(weekday.get()); // Return String
  }
  
  public static void main(String[] args) {
    
    Supplier<String> hello = () -> "hello";
    System.out.println(hello.get()); //retrun String

    Supplier<Weekday> monday = () -> Weekday.MONDAY; //same meaning
    Weekday monday2 = Weekday.MONDAY; //same meaning

    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get()); //LocalDate.now();
    System.out.println(LocalDate.now());

    Supplier<Integer> random = () -> new Random().nextInt(10) +1; // 0-9 +1;
    System.out.println(random.get());

  }
}
