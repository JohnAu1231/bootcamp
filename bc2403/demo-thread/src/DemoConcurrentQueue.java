import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DemoConcurrentQueue {
  
  static Queue<Character> queue2 = new ArrayBlockingQueue<>(0);
  static Queue<Character> queue = new ConcurrentLinkedQueue<>();

  public static void main(String[] args) {
    
    long startTime = System.currentTimeMillis();
    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 10_000_000; i++) {
        queue.add('s');
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
    System.out.println(queue.size());
    System.out.println(endTime-startTime);
  
  }
}
