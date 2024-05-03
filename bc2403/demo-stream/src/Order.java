import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {
  private int orderId;
  private double amount;
  private int customerId;
  private LocalDate orderDate;

  public Order(int orderId, int customerId, double amount, LocalDate orderDate) {
    this.orderId = orderId;
    this.customerId = customerId;
    this.amount = amount;
    this.orderDate = orderDate;
  }

  public double getAmount() {
    return this.amount;
  }

  public LocalDate getDate() {
    return this.orderDate;
  }

  public int getCustomerID() {
    return this.customerId;
  }

  public int getOrderID() {
    return this.orderId;
  }

  @Override
  public String toString() {
    return "Order(" //
          + "amount=" + this.amount //
          + ")";
          
  }

public static void main(String[] args) {
  List<Order> orders = new ArrayList<>();
  orders.add(new Order(1, 101, 800, LocalDate.of(2023, 4, 15)));
  orders.add(new Order(2, 102, 1200, LocalDate.of(2023, 4, 20)));
  orders.add(new Order(3, 101, 1500, LocalDate.of(2023, 4, 25)));
  orders.add(new Order(4, 103, 900, LocalDate.of(2023, 4, 18)));
  orders.add(new Order(5, 102, 1100, LocalDate.of(2023, 4, 22)));
  orders.add(new Order(6, 102, 850, LocalDate.of(2023, 4, 15)));

  //filter amount <1000
  // sort descending order by orderDate
  // group by customer ID -> average  amount of orders per customer
  // Collect to Map<Integer, Double>

  //filter orders of that customer with total all amount > 1100
  Map<Integer, Double> result3 = orders.stream()  //
        .filter(e -> e.getAmount() < 1000) //
        .sorted((d1, d2) -> d1.getDate().isAfter(d2.getDate()) ? -1 : 1) //
        .collect(Collectors.groupingBy(Order::getCustomerID, //
          Collectors.averagingDouble(Order::getAmount))) //
        ;
    System.out.println(result3);
     List<Order> result4 =
      orders.stream() //
          .collect(Collectors.groupingBy(Order::getCustomerID
          ,Collectors.summingDouble(Order::getAmount))) //     map[id : id's amount sum]
          .entrySet().stream()   // map -> map's entry ->stream()
          .filter(e -> e.getValue() > 1100)  // entry's value >1100
          .flatMap(e -> orders.stream()    // use the filtered map's key to find order int original list
            .filter(order -> order.getCustomerID() == e.getKey())) // 
          .collect(Collectors.toList());
          
    
            System.out.println(result4);
}
}
