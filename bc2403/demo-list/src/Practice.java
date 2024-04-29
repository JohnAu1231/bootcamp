import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
  
  public static void main(String[] args) {
    
   List<Integer> integers = new ArrayList<>();
    integers.add(2);
    integers.add(2);
    integers.add(3);
    integers.add(3);
    integers.add(1);
    System.out.println(getDuplicated(integers));

  }


  public static Set<Integer> getDuplicated(List<Integer> integers) { // 2,2,3,3,1 ->2,3
    HashSet<Integer> hs = new HashSet<>();
    Set<Integer> ans = new HashSet<>();
    for (Integer i : integers) {
      if (hs.contains(i))
        ans.add(i);
      hs.add(i);
    } 
    return ans;


  }
}
