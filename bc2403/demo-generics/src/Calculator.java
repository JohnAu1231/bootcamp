import java.math.BigDecimal;

public class Calculator<T extends Number> {

  private T x;

  private T y;

  public double sum3(T x, T y) {
    return x.doubleValue() + y.doubleValue();
  }
  public static int sum(int x, int y) {
    return x + y;
  }

  public static double sum(double x, double y) {
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  //"<T extends Numer>" implies x and y are the object that belongs to byte,short,long,Integer,double,float
  // so cannot pass a String object into the parameters x and y

  //compile-time -> type-safety
  //limit the type range of x any y, so that x any y must be able to call doubleValue();

  //run-time -> Polymorphism
  // sum(2.3f, 3.2d)
  //x.doubleValue() -> find the Float object in heap, we are calling the Float.doubleValue();
  public static <T extends Number & Swim> double sum(T x, T y) { //type safety
    return BigDecimal.valueOf(x.doubleValue()).add(BigDecimal.valueOf(y.doubleValue())).doubleValue();
  }
  public static double sum2(Number x , Number y) {
    return x.doubleValue() + y.doubleValue();
  }
  public static void main(String[] args) {
    
    System.out.println(sum(2,3)); //5
    System.out.println(sum(2.0d,3L)); //5.0
    System.out.println(sum(2.0d,3)); //5.0
    System.out.println(sum(2.0f,3L)); //5.0

    System.out.println(sum2(2.0f,3.0d));
    System.out.println(sum2(2.0,3.0));
    System.out.println(sum2(2L,3.0d));
    System.out.println(sum2(2,3.0f));

    Calculator<Long> cal = new Calculator<>();
    System.out.println(cal.sum3(Long.valueOf(10), Long.valueOf(20)));

    Calculator.sum(new SuperLong(), new SuperLong());
  }
}
