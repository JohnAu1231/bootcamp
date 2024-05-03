import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //Java 10
        String x = "hello";

        var x2 = "hello"; // compile time check the type of x2
        // String x2 = "hello";

        var age = 5;
        var name = "Vincent";
        var c = 'a';
        var names = List.of("Vincent", "Oscar");
        
        for (var n : names) {
            System.out.println(n);
        }

        //cannot do in var
        //1. return type
        // public static var print(int x) { compile error
        //     retrn x;
        // }
        //2. instance variable
        // private var age;  compile error
        //3. without initialization
        // var n;
        //4. lambda expression
        // var isTooLong = s -> s.length() > 10;
        //5. array
        //var arr = {1,2,3}
        // var arr = mew int[] {1,2,3}  // this work, because the arrya declare the type
        //6. input parameter
        //
    }
}
