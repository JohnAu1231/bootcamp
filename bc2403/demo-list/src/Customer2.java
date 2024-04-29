import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer2 {

  private String name;

  private ArrayList<Order> orders;

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {

    ArrayList<Customer2> customers = new ArrayList();
    // searching
    for (Customer2 c : customers) {
      if (c.getName().equals("Vincent")) {

      }
    }
    // but hashMap contains loading quicker
    // List (ArrayList)
    HashSet<String> strings = new HashSet<>();
    strings.add("abc"); // ture
    strings.add("abc"); // false; data structure of HashSet -> HashMap
    System.out.println(strings.size()); // 1

    // Polymorphism
    List<String> ss = new ArrayList<>();
    // ss object reference can only point to the methods that comply with List interface
    ss.add("hello");
    ss.remove(0);
    ss.add("abc");
    System.out.print(ss.get(0));

    // Set (HashSet)
    Set<String> ss2 = new HashSet<>();
    ss2.add("hello)");
    ss2.remove("hello");
    System.out.println(ss2.size());

    // Map (HashMap)
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("John", "ABC");
    System.out.println(stringMap.get("John"));

    Collection<String> cs = new ArrayList<>();
    cs.add("hello");
    System.out.println(cs.size());

    test(new ArrayList<>(List.of("ho", "Vincent"))); //hello
    test(new HashSet<>(Set.of("world", "sky"))); //true

    System.out.println(new ArrayList<>(List.of("Vincent")).contains("Vincent")); // true, low performance
    System.out.println(new HashSet<>(Set.of("Vincent")).contains("Vincent")); // true, hig performance
  }

  public static void test(Collection<String> cs) {
    if (cs instanceof ArrayList<String>) {
      ArrayList<String> as = (ArrayList<String>) cs;
      System.out.println(as.get(0));
    } else if (cs instanceof HashSet<String>) {
      HashSet<String> hs = (HashSet<String>) cs;
      System.out.println(hs.add("hello"));
    }
  }
}
