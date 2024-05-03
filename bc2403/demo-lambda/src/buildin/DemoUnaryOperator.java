package buildin;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {
  
  public static void main(String[] args) {
    
    Function<String, String> f1 = s -> s.concat("hello");
    //Function<T, T>
    UnaryOperator<String> addHello = s -> s.concat("hello");

    BiFunction<Integer, Integer, Integer> f2 = (x, y) -> x + y;
    //BiFunction<T, T, T>
    BinaryOperator<Integer> sum = (x, y) -> x + y;

    // toUpperCase string.toUpperCase
    UnaryOperator<String> upperCase = s -> s.toUpperCase();
    String str = "hello";
    System.out.println(upperCase.apply(str));

    UnaryOperator<String> lowerCase = s -> s.toLowerCase();
    System.out.println(lowerCase.apply(str));

    //3in 1 out-> string, replace from string2 to string 3 -> string 4
    StringFormula formula = (str2, from, to) -> str2.toUpperCase().replace(from, to);
    System.out.println(formula.uppercaseNreplace(str, "LL", "PP"));
  }
}
