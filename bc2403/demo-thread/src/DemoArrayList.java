import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class DemoArrayList {
  static List<Character> characters = new ArrayList<>();
 
  public static void main(String[] args) {
    
    long startTime = System.currentTimeMillis();
    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 10_000_000; i++) {
        characters.add('s');
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
    System.out.println(characters.size());
    System.out.println(endTime-startTime);
  }
}
