import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  
  public static void main(String[] args) {
    
    Queue<Integer> integers = new PriorityQueue<>();
    integers.add(12);
    integers.add(5); 
    System.out.println(integers); 
    integers.add(-2); 
    System.out.println(integers); 
    integers.add(-5); 
    System.out.println(integers.poll()); //-5 sorting
    System.out.println(integers.poll()); //-2 sorting
    System.out.println(integers.poll()); //5 sorting
    System.out.println(integers); 
    System.out.println(integers.poll()); // 12 sorting

    PriorityQueue<Integer> pq = new PriorityQueue<>(new IncOrdEven());
    pq.add(2);
    pq.add(20);
    pq.add(21);
    pq.add(27);
    pq.add(200);
    pq.add(25);
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq);
  }
}
