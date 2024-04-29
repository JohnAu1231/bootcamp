import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BootcampQ<T> {

  private Queue<T> data;

  private Object data2;

  public BootcampQ() {
    this.data = new LinkedList<>();
  }

  public void add(T str) { //object is class, T is not a class, is ready to become a class;
    this.data.add(str);
  }

  public void add2(Object data2) {
    this.data2 = data;
  }

  public T poll() {
    return this.data.poll();
  }

  // @Override
  // public String toString() {
  //   return "data=" //
  //         + data
  // }



  public static void main(String[] args) {
    BootcampQ<String> bq = new BootcampQ<>();
    bq.add("hello");
    System.out.println(bq.toString());
    bq.add2(3);
    bq.add2(3L);
    bq.add2("lllll");
  }
}
