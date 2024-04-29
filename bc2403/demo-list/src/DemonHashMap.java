import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemonHashMap {

  public static void main(String[] args) {
    
    // John 13
    // Vincent 18
    HashMap<String, Integer> mapper = new HashMap<>();  //HashMap< key, value>

    mapper.put("John", Integer.valueOf(13)); // put an "entry" into map;
    mapper.put("Vincent" , 18);
    // Get value by Key, never get key by value;
    System.out.println(mapper.get("Vincent"));
    System.out.println(mapper.get("John"));

    for (Map.Entry<String, Integer> m: mapper.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }

    // Key cannot be duplicated in a HashMap
    // put -> update
    mapper.put("Vincent", 20);
    System.out.println(mapper.get("Vincent")); // 20

    mapper.put("Jenny", 24);
    //sum up all integers in the map
    int sum = 0;
    for (Map.Entry<String, Integer> m: mapper.entrySet()) {
      sum += m.getValue();
    }
    System.out.println(sum);

    //HashMap compare the key by hashCode;
    HashMap<Customer, Integer> ageMap = new HashMap<>();
    ageMap.put(new Customer("John"), 13);
    ageMap.put(new Customer("John"), 17);
    System.out.println(ageMap.get(new Customer("John"))); //17

    System.out.println(ageMap.size()); //1

    HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();
    // John -> order 1:100, order 2:250
    // vincent -> order1: 1200,order 2:20, order3: 88

    //totoalOrderAmount = 
    int total = 0;
    ArrayList<Order> jOrders = new ArrayList<>();
    jOrders.add(new Order(100));
    jOrders.add(new Order(250));
    ArrayList<Order> vOrders = new ArrayList<>();
    vOrders.add(new Order(1200));
    vOrders.add(new Order(20));
    vOrders.add(new Order(88));
    orderMap.put(new Customer("John"), jOrders);
    orderMap.put(new Customer("Vincent"), vOrders);

    //entrySet()
    for (Map.Entry<Customer, ArrayList<Order>> map: orderMap.entrySet()) {
      // for (Order o : map.getValue()) {
      //  total += o.getAmount();
      for (int i = 0; i < map.getValue().size(); i++) {
        total += map.getValue().get(i).getAmount();
      }
    }
    System.out.println(total);
    // values()
    sum = 0;
    for (ArrayList<Order> orderList : orderMap.values()) {
      for (Order o: orderList) {
        sum += o.getAmount();
      }
    }
    //keySet()
    sum = 0;
    for (Customer customer : orderMap.keySet()) {
      System.out.println("customer=" + customer.getName());
      }
    
    //containsKey() , containsValue()
    System.out.println(orderMap.containsKey(new Customer("Vincent")));

    //Conclusion:
    //1.if they are Different Objects -> we can treat them as same thing (equals(), hashCode());
    //2. if they are same Object -> all their values are same;

    orderMap.put(new Customer("Sally"), jOrders);
    System.out.println(orderMap.get(new Customer("Sally")).toString());
    System.out.println(orderMap.get(new Customer("John")));
    jOrders.add(new Order(66));
    System.out.println(orderMap.get(new Customer("Sally")));
    System.out.println(orderMap.get(new Customer("John")));


    System.out.println(orderMap);
    HashMap<String, ArrayList<Order>> example1 = new HashMap<>();
    HashMap<Integer, ArrayList<Order>> example2 = new HashMap<>();

    orderMap.remove(new Customer("Vincent"));  //with hashCode(), cannot remove by customer object
    System.out.println(orderMap);
  }
}
