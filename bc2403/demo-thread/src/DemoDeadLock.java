public class DemoDeadLock {
  private Object lock1 = new Object();
  private Object lock2 = new Object();
  
  public void method1(){
    synchronized (lock1) {
    System.out.println("method1");
    method2();
    }
  }
  public void method2(){
    synchronized (lock2) {
    System.out.println("method2");
    method1();
    }
  }
  public static void main(String[] args) {
    DemoDeadLock dd = new DemoDeadLock();
   Thread thread1 = new Thread( () -> dd.method1());
    Thread thread2 = new Thread( () -> dd.method2());
    thread1.start();
    thread2.start();
    System.out.println("main end");
  }
}
