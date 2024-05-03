@FunctionalInterface
public interface Calculator {
  int square(int x);

  public static void main(String[] args) {
    
    Calculator ca = (x) -> {
      return (int)Math.pow(x, 2);
    };
  
  // if we have only one parameter in the method of FunctionalInterface
  Calculator ca2 = x -> (int) Math.pow(x,2);

  //what is this?
  Calculator ca3 = x -> 3;


  System.out.println(ca3.square(5));
  System.out.println(ca2.square(9));
  }
}
