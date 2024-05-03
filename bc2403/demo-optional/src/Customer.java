import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Customer {

  private Optional<String> name;

  private String name2;

  public Optional<String> getName() { // getNmae() well-known method, getter/setter should not return Optiona<T>
    return this.name;
  }

  public Customer(Optional<String> name) {
    this.name = name;
  }

  // deserialization/ serialization 序列化
  // {
  // "name" : "John"
  // }

  // Java Object <-> JSON (deserialization/ serialization)
  // Optional cannot be supported by deserialization/ serialization

  public static Double sum(Double d1, Double d2) {
    if (d1 == null || d2 == null)
      throw new IllegalArgumentException();
    return d1.doubleValue() + d2.doubleValue();
  }

  public static Double sum2(Optional<Double> d1, Optional<Double> d2) {
    if (d1.isPresent() && d2.isPresent()) {
      return d1.get().doubleValue() + d2.get().doubleValue();
    }
    throw new IllegalArgumentException();
  }

  public static void main(String[] args) {
    // sum2(null, Optional.of(Double.valueOf(3.0d))); //NPE
    Optional<String> result = null;



    String str = "hello";
    int x = 10;
    if (x >= 10)
      str = null;
    result = Optional.ofNullable(str); // can store null or non-null object

    // Optional.of(null); // NPE
    List<String> names = new ArrayList<>(List.of("Vincent", "Jenny", "Oscar"));

    // stream
    List<Optional<String>> result2 = names.stream()
        .map(e -> Optional.ofNullable(e)) //
        .collect(Collectors.toList()); //
        
    List<Optional<String>> result3 = names.stream()
        .map(Optional::ofNullable) // method reference,using lambda funtion, if u in out = same, can use this writing type
        .collect(Collectors.toList()); //
      //result2 == result3
    System.out.println(result2);
  }
}
