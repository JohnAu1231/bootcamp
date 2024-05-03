public class DemoSyncLock {

  private static int x =17;

  private final Object lock = new Object();

  public synchronized void addOne() {
    int score = 100;
    
    synchronized (lock) {
    x++;
    }
    int result = (int) Math.pow(score++, 2);
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    DemoSyncLock ds1 = new DemoSyncLock();

    Runnable task = () -> {
      for (int i =0; i < 1_000_000; i++) {
        ds1.addOne();;
  
      }
    };
    Thread th1 = new Thread(task);
    Thread th2 = new Thread(task);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    } catch (InterruptedException e) {

    }
    long endTime = System.currentTimeMillis();
    System.out.println(DemoSyncLock.x);
    System.out.println(endTime-startTime);
  }
  
}
