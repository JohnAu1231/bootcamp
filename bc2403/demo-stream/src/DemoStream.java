import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        integers.add(21);
        integers.add(44);
        integers.add(100);
        integers.add(101);

        // List of Odd number
        List<Integer> odds = new ArrayList<>();
        for (Integer i : integers) {
            if (i % 2 == 1)
                odds.add(i);
        }
        System.out.println(odds);

        // Stream
        List<Integer> result = integers.stream() // List<Integer> -> Stream<Integer>
                .filter(e -> e % 2 == 1) // keep which element // Stream<Integer>
                .filter(e -> e > 100) //
                .collect(Collectors.toList()); // List<Integer> (new)
        System.out.println(result); // [21, 101]

        List<Integer> result2 = integers.stream() // List<Integer> -> Stream<Integer>
                .filter(e -> e % 2 == 1 && e > 100) // keep which element // Stream<Integer>
                .collect(Collectors.toList()); // List<Integer> (new)
        System.out.println(result); // [21, 101]

        List<Integer> integers2 = new LinkedList<>(List.of(101, 101, 203, 200));
        //remove duplicated -> Set
        List<Integer> result4 = integers2.stream() //
                .distinct() //
                .collect(Collectors.toList());

        //counting
        Long size = integers2.stream() //
        .distinct() //
        .count();
        System.out.println(size);


        List<Customer> customers = new LinkedList<>(List.of(new Customer(12, "John"), new Customer(30, "Oscar")));
        List<Customer> adultCustomers = customers.stream() // -> new Stream<Customer>, make a new object in heap
                                    .filter(e -> e.getAge() >= 18) // call Stream's method
                                    .collect(Collectors.toList()); // -> new ArrayList<Customer>, point the excisting object
        System.out.println(customers);
        System.out.println(adultCustomers);
        customers.get(1).setAge(20);
        System.out.println(customers);
        System.out.println(adultCustomers);

        String[] strings = new String[] {"abc", "Akjf", "a", "bcd", "aaa"};
        // stream -> startsWith "a";
        
        List<String> startsWitha = Arrays.asList(strings).stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
        System.out.println(startsWitha);

        // list -> array
        String[] arr = startsWitha.stream().toArray(s -> new String [s]);
        System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> getOdds(List<Integer> integers) {
        return integers.stream() //
                .filter(e -> e % 2 == 1) //
                .collect(Collectors.toList());
    }
}
