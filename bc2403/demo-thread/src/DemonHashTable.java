import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DemonHashTable {
  // Hashtable = thread safe
  // HashMap = not thread safe
  // public static Map<String, Integer> ht = new Hashtable<String, Integer>();
  public static Map<String, Integer> ht = new HashMap<>();

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 10_000_000; i++) {
        String str =  String.valueOf(i);
        ht.put(str,i);
      }
    };

    Thread th1 = new Thread(concatLinkedList);
    Thread th2 = new Thread(concatLinkedList);
    th1.start();
    th2.start();

    // 3 thread to 1 thread
    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e) {

    }
    long endTime = System.currentTimeMillis();
    System.out.println(ht.size());
    System.out.println(endTime-startTime);
  
  
  }
}
