import java.util.Arrays;
import java.util.PriorityQueue;

public class testqueue {
  
  public static void main(String[] args) {
    
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(5);   //[5]
    pq.add(3);    // [3, 5]
    pq.add(7);    // [7, 3 ,5]
    pq.add(1);   // [1,7,3,5]

    for (Integer i : pq) {
      System.out.println(i);   // [1,3,7,5]
    }
    System.out.println("------------------");
    PriorityQueue<Integer> numbers = new PriorityQueue<>();
    numbers.add(2);  //2
    numbers.add(4);  //4,2  -> 2,4
    numbers.add(1);  //1, 2, 4
    numbers.add(3);  // 3, 1, 4, 2---> 1, 3, 2, 4
    numbers.add(5);  //5 , 3, 1, 4, 2---> 1,3,2,4,5
    numbers.add(1);  //1,3,1,4,5,2

    for (Integer i : numbers) {
      System.out.println(i);   // 
    }
    
  }
}
