import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {

  public static void main(String[] args) {

    Stream<String> empty = Stream.empty(); // static method -> constructor -> new Stream object
    System.out.println(empty.count()); // 0

    Stream<String> strings = Stream.of("Hello", "abc"); // static method -> constructor -> new Stream object

    Stream<Integer> integers = Stream.iterate(1, n -> n + 2).limit(10);
    System.out.println(integers.collect(Collectors.toList()));

    strings = strings.filter(e -> e.length() > 3); // intermediate operation -> new Stream // in this line not filte yet, just creat new object
    // .count(); // terminal operation
    System.out.println(strings.collect(Collectors.toList())); // Hello

    // stream -> forEach
    // strings.forEach(e -> { //terminal operation, error, becuase in line18, the stream already do terminal operation
    // System.out.println(e); // each stream only can do terminal once;
    // });

    // sorted()
    List<Integer> integers2 =
        new ArrayList<>(List.of(400, 3, -1, 0, 100, -200));
    List<Integer> integers3 = integers2.stream() //
        .filter(e -> e.compareTo(0) >= 0) //
        .sorted() // interminate operation
        .collect(Collectors.toList());
    System.out.println(integers3);


    List<Customer> customers =
        new LinkedList<>(List.of(new Customer(13, "Vincent"),
            new Customer(18, "Tommy"), new Customer(15, "Jenny")));

    // Comparator constructed by lambda
    Comparator<Customer> sortByAgeDesc =
        (c1, c2) -> c1.getAge() > c2.getAge() ? -1 : 1;
    List<Customer> sortedCustomers = customers.stream() //
        .sorted(sortByAgeDesc) // comparator object -> descending order for age
        .collect(Collectors.toList());
    List<Customer> sort2 = customers.stream() //
        .sorted((c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1) //
        .collect(Collectors.toList());
    System.out.println(sortedCustomers);
    System.out.println(sort2);

    // List<Customer> -> List<String>
    // Type Change
    List<String> names = customers.stream() //
    .filter(e -> e.getAge() > 13) //  filter object
    .map(e -> e.getName())  // typer change: Customer -> String
    .collect(Collectors.toList()); // List<String>
    System.out.println(names); // [Tommy, Jenny]
    
    Map<Integer, String> names2 = customers.stream() //
    .filter(e -> e.getAge() > 13) //  filter object 
    .collect(Collectors.toMap(s -> s.getAge(), s -> s.getName())); // List<String>

    System.out.println(names2); // [Tommy, Jenny]

      Stream.of(1,2,3).map(i -> {
        System.out.println(i) ;
        return i +1; // nothing occur if the code end in this line;
      }).forEach(e -> System.out.println(e));
      // because map() is interminate operations, the map functio will not be executed until terminal operation.

      Stream.of(1,2,3).map(i -> {
        System.out.println(i) ;
        return i +1; // nothing occur if the code end in this line;
      }).count();
      // becasuse map() won't affect the result of count, 
      // so Stream would not execute map function if the terminal operation is count()

  }
}
