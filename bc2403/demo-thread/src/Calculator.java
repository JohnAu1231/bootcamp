public class Calculator {

  public static int x = 17;

  public synchronized static void addOne() {
    x++;
  }

  public static void main(String[] args) {
    Runnable incrementOne = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        // Calculator.x++;
      Calculator.addOne();
      }
    };

    Thread th1 = new Thread(incrementOne);
    Thread th2 = new Thread(incrementOne);
    th1.start();
    th2.start();

    try {
      th1.join();
      th2.join(); // main thread restrat when th2 end
    } catch (InterruptedException e) {

    }

    System.out.println(Calculator.x); // main thread
  }
}
