import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
 
  static AtomicInteger x = new AtomicInteger(17);
  static int y = 17;

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Runnable task = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        x.incrementAndGet();  //30-40 ms
        // y++;     //10ms
      }
    };
    Thread th1 = new Thread(task);
    Thread th2 = new Thread(task);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    } catch (InterruptedException e) {};
    long endTime = System.currentTimeMillis();
    System.out.println(x);
    System.out.println(endTime-startTime);
  }
}
