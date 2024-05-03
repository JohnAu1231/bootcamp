import java.util.Comparator;

public class Descending implements Comparator<Customer> {

  @Override
  public int compare(Customer c1, Customer c2) {
    if (c1.getAge() > c2.getAge())
      return -1;
    return 1;
  }

  
}
