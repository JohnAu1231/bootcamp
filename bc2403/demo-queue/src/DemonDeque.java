import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class DemonDeque {
  
  public static void main(String[] args) {
    
    //Deque extends Queue
    Deque<String> strings = new LinkedList<>();
    strings.add("hello"); // addLast -> tail
    strings.add("abc");

    strings.addFirst("ijk");
    System.out.println(strings);

    System.out.println(strings.poll()); // pollFirst()
    System.out.println(strings.pollLast()); // poll the element from tail

    strings.add("world");
    System.out.println(strings.peekFirst());
    System.out.println(strings.peekLast());

    strings.pop(); //removeFirst()
    System.out.println(strings); // [world]
    strings.push("mmm"); // addFirst   [mmm, world]
    System.out.println(strings);

    // stack (pop, push)   , stack same way in and take;
    List<String> string3 = new Stack<>(); // thread-safe
    strings.add("hello");
    Stack<String> strings4 = new Stack<>();
    strings4.push("hello");
    strings4.push("hello2");
    strings4.push("hello3");
    System.out.println(strings4);
    System.out.println(strings4.pop());

    //Use case: reverse 

    //Queue  can remove by Object
    //Queue/ Deque -> LinkedList or Array
    Queue<String> qs = new ArrayDeque<>(); // LinkedList/ Array
    qs.add("hello");
    qs.add("abc");  //array -> resize
    System.out.println(qs.poll()); 
    qs.add("x");
    qs.add("y");
    qs.remove(); // abc
    System.out.println(qs);
    qs.remove("y");
    System.out.println(qs);
    
    Deque<String> ds = (Deque<String>) qs;
    ds.addLast("mmm");
    ds.addFirst("nnn");
    System.out.println(ds); //[nnn, x, mmm]

    System.out.println(qs);
    qs.offer("kkk");
    System.out.println(qs);

    Deque<String> ds2 = new LinkedBlockingDeque<>(2);
    ds2.add("hello");
    ds2.add("world");
    System.out.println(ds2.size());
    System.out.println(ds2.offer("yy"));
    System.out.println(ds2);

  }
}
