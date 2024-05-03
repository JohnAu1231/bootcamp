package buildin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  
  public static void main(String[] args) {
    //y = f(x)
    //y = x + 1
    Function<String, Integer> function = s -> s.length();
    System.out.println(function.apply("Hello"));

    BiFunction<String, String, Integer> totalLength = (s1, s2) -> s1.length() + s2.length();
    System.out.println(totalLength.apply("Hello", "abc"));

    // Why do we need to learn BiFunction
    Map<String, Integer> nameLengthMap = new HashMap<>();
    nameLengthMap.put("John", "John".length());
    Function<String, Integer> nameLength = s -> s.length();
    nameLengthMap.computeIfAbsent("Vincent", nameLength); //If "Vincent" does not exists -> nameLength
    nameLengthMap.computeIfAbsent("Oscar", s -> s.length()); //If "Vincent" does not exists -> nameLength
    System.out.println(nameLengthMap);

    // merge()
    System.out.println(function.apply("Hello"));

    BiFunction<Integer, Integer, Integer> adding = (s1, s2) -> s1 + s2;
    System.out.println(nameLengthMap.merge("Vincent", 7, (a, b) -> (a - b)));
    System.out.println(nameLengthMap);
    System.out.println(nameLengthMap.merge("Vincent", 15, adding));
    System.out.println(nameLengthMap.merge("Joe", 8, adding));
    System.out.println(nameLengthMap);
  }
}
