import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
  private String name;
  private String category;
  private double price;
  private int quantity;

  public Product(String name, String category, double price, int quantity) {
    this.name = name;
    this.category = category;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQunatity() {
    return this.quantity;
  }

public static void main(String[] args) {
  List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 1200, 5));
        products.add(new Product("Book", "Stationery", 500, 10));
        products.add(new Product("Watch", "Fashion", 1500, 3));
        products.add(new Product("Headphones", "Electronics", 800, 8));
        products.add(new Product("Shoes", "Fashion", 2000, 2));

  // Filter all products with price >1000
  // sort ascending order by name (done by lambda expression)
 // 3.map the result set to a list of string "Laptop-5"

 List<String> result2 = products.stream() //
          .filter(e -> e.getPrice() > 1000) //
          .sorted((n1, n2) -> n1.getName().compareToIgnoreCase(n2.getName())) //
          .map(e -> e.getName().concat("-").concat(String.valueOf(e.getQunatity()))) //
          .collect(Collectors.toList());
          System.out.println(result2);
}
  
}


