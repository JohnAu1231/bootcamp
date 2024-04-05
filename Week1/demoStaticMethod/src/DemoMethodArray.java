import java.util.Arrays;

public class DemoMethodArray {
  public static void main(String[] args) {
    double[] prices = new double[] {2.0, 9.8, 5.6};
    int[] quantities = new int[] {2, 4, 5};

    double totalAmount = DemoMethodArray.totalAmount(prices, quantities);
    double subTotal = subTotal(prices[0], quantities[0]);
    System.out.println(subTotal);
    System.out.println(totalAmount);
    String[] ss = new String[] {"a a a ", "b b b "};
    String[] ss2 = trimSpace(ss);
    System.out.println(Arrays.toString(ss2));
  trimSpace2(ss);
  System.out.println(Arrays.toString(ss));
    // call method
    // Class.Method()
    //Class should start with UpperCase
    
    
  }

  //Method: total Amount -> call subTotal()
  public static double totalAmount(double[] prices, int[] quantities) {
    double totalAmount = 0.0d;
    for (int i = 0; i < prices.length; i++) {
      totalAmount += subTotal(prices[i], quantities[i]);
    }
    return totalAmount;
  }
  //Mehod: subTotal(double price, int quantity)
  public static double subTotal(double price, int quantity) {
    return price * quantity;
  }

  public static String trimSpace(String s) {
    return s.replace(" ", "");
  }

  //return {"aaa", "bbb"}
  public static String[] trimSpace(String[] ss) {
    String[] result = new String[ss.length];
    for (int i = 0; i < ss.length; i++) {
      result[i] = ss[i].replace(" ","");
  
    }
    return result; // returning "result" string array object address
    // String is unrewable 
  }

  //array pass by reference(address)
  public static void trimSpace2(String[] ss) { // void no return type
    for (int i = 0; i < ss.length; i++) {
      ss[i] = ss[i].replace(" ","");
    } //array pass by referenect, so no need return
  //String pass by value (a copy of the original string object)
  //public static Integer sum(Integer x, Integer y) {  // pass by value
    //retrun x + y; int + int -> int -> autobox
  }


}
