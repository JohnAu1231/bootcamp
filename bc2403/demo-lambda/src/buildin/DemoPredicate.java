package buildin;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) {
    int age = 18;
    boolean isElderly = age > 65;

    Predicate<Integer> isElderly2 = age2 -> age2 > 65;

    System.out.println(isElderly2.test(66));
    System.out.println(isElderly2.test(6));

    BiPredicate<String, Integer> isCharacterS = (str, idx) -> str.charAt(idx) == 'S';  //Lambda is Object, in heap
    System.out.println(isCharacterS.test("Suki", 0));
    System.out.println(isCharacterS.test("Suki", 2));

    BiPredicate<String, String> startsWith = (s1, s2) -> s1.startsWith(s2);
    System.out.println(startsWith.test("hello", "he"));
    System.out.println(startsWith.test("hello", "e"));

    BiPredicate<String, String> endsWith = (s1, s2) -> s1.endsWith(s2);
    System.out.println(endsWith.test("hello", "lo"));
    System.out.println(endsWith.test("hello", "e"));

    BiPredicate<String, String> combined = startsWith.and(endsWith);
    System.out.println(combined.test("hello", "lo")); //false; if start=lo and end=lo == ture, then true
    System.out.println(combined.test("lollo", "lo")); //true;

    BiPredicate<String, String> combined2 = startsWith.or(endsWith);
    System.out.println(combined2.test("hello", "lo")); //true;  if start=lo or end =lo  == true, then true
    System.out.println(combined2.test("lollo", "lo")); //true;

    BiPredicate<String, Integer> lengthLargerThan = (s1, length) -> s1.length() > length;
    System.out.println(lengthLargerThan.test("hello", 4));
    System.out.println(lengthLargerThan.test("hello", 6));
    



  }

  public static boolean isCharacterS(String s, Integer idx) {
    return s.charAt(idx) == 'S';
  }
}
