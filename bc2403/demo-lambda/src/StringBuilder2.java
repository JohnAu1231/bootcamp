import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface StringBuilder2 {
  
  String concat(List<String> strings);

  public static void main(String[] args) {
    StringBuilder2 str = (x) -> {
      StringBuilder sb  = new StringBuilder();
      for (String s: x) {
        sb.append(s);
      }
      return sb.toString();
    };
    StringBuilder2 rrr = (x) -> {
      StringBuilder sb  = new StringBuilder();
      for (String s: x) {
        sb.append(s);
        System.out.println("hi");
      }
      return sb.toString();
    };
    List<String> ls1 = new ArrayList<>();
    ls1.add("He");
    ls1.add("He");
    String result = str.concat(new ArrayList<>(List.of("a","b","c")));
    System.out.println(str.concat(ls1));
    System.out.println(result);
    System.out.println(str.concat(new ArrayList<>(List.of("a","b","c"))));
    System.out.println(rrr.concat(new ArrayList<>(List.of("a","b","c"))));
      
  }
}
