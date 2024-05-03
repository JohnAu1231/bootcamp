public class DemoString {
  static String x = "A";

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Runnable task = () -> {
      for (int i = 0; i < 1_000_00; i++) {
       x = x.concat("a");
      }
    };

    Thread th1 = new Thread(task);
    Thread th2 = new Thread(task);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    } catch(InterruptedException e) {}

    long endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime);
    System.out.println(x.length());
  }
}
