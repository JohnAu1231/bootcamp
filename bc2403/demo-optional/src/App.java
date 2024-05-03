import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(upperName("Steven")); // Optional[STEVEN]
        System.out.println(upperName("Steven").get()); // STEVEN
        System.out.println(upperName(null)); // Optional.empty;

        // Optional.of(null) //NPE
        // Optional.ofNullable(null) // Option.empty

        // ifPresent
        upperName(null).ifPresent(e -> {
            System.out.println("hello" + e.charAt(0)); // e - >T (String.class) , e must be non-null value
        });

        Optional.empty().ifPresent(e -> {
            System.out.println("hello"); // e must be non-null value
        });

        // Optional<String> abc = null;
        // abc.ifPresent(e -> {
        // System.out.println("hello" ); // e must be non-null value
        // });

        upperName("Steven").ifPresent(e -> {
            System.out.println("hello" + e.charAt(0)); // e must be non-null value
        });

        Optional<String> result = upperName(null);
        Optional<String> result2 = upperName("John");
        // isPresent
        if (result.isPresent()) {
            System.out.println("example2=" + result.get());
        } else {
            System.out.println("example2=" + result); // Optional.empty -> cannot call get();
        }
        if (result2.isPresent()) {
            System.out.println("example2=" + result2.get().charAt(0));
        } else {
            System.out.println("example2=" + result2); // Optional.empty -> cannot call get();
        }

        // 3. orElse
        Optional<String> name = Optional.of("Vincent");
        Customer c1 = new Customer(Optional.of("John"));
        Optional<Customer> cc = Optional.of(c1);
        // Optional<String> name = Optional.ofNullable(null);
        System.out.println(Optional.ofNullable(null)); // Optional.empty

        // String user = name.orElse("Jenny"); // T
        // System.out.println(user);


   
        // 4. orElseGet

        // String user2 = name.orElseGet(() -> "Jenny"); // Supplier<T>
        // System.out.println(user2);
        // String ex2 = name.orElseGet(() -> getDefault());
        // System.out.println(ex2);

        // 5. ofElseThrow // if null, throw exception

        String user3 = name.orElseThrow(() -> new RuntimeException());
        System.out.println(user3);

        // 6. stream and optional
        List<Cat> ls = List.of(new Cat(3, "Vincent"), new Cat(6, "Oscar"),
                new Cat(4, "Tommy"), new Cat(10, "Vincent"));
        List<Cat> ls2 = List.of(new Cat(3, "John"), new Cat(6, "Oscar"),
                new Cat(4, "Tommy"), new Cat(10, "Jenny"));
        // if is null
        Cat cat = ls.stream() //
                .filter(e -> "Vincent".equals(e.getName())) //
                .findFirst() // Optional<Cat>
                .orElse(new Cat(0, "Vincent")); // Cat
        Cat cat2 = ls2.stream() //
                .filter(e -> "Vincent".equals(e.getName())) //
                .findFirst() // Optional<Cat>
                .orElse(new Cat(0, "Vincent")); // Cat
        System.out.println(cat);
        System.out.println(cat2);
        // ls has vincent , so printing
       ls.stream() //
        .filter(e -> "Vincent".equals(e.getName())) //
        .findFirst() // Optional<Cat>
        .ifPresent(e -> {
            System.out.println("age="+e.getAge());
        });
        // ls2 vincent is null, so not printing
       ls2.stream() //
       .filter(e -> "Vincent".equals(e.getName())) //
       .findFirst() // Optional<Cat>
       .ifPresent(e -> {
           System.out.println("Age="+e.getAge());
       });

       
       String ex1 = name.orElse(getDefault());   // return <T>  will run the method, don't use
       System.out.println("ex2="+ex1);
       String ex2 = name.orElseGet(() -> getDefault()); // get() supplier<T> value
       System.out.println(ex2);
       
    }

    public static String getDefault() {
        System.out.println("do invoke!!!");
        return "default";
    }

    public static Optional<String> upperName(String name) {
        // if (name == null)
        // throw new IllegalArgumentException();
        if (name != null)
            return Optional.of(name.toUpperCase());
        return Optional.empty(); // optional object ,with a null value
    }


}
