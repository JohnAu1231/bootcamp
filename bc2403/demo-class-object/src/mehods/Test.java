package mehods;

public class Test {

  //Attribute / Instance variable
  private int v;

  public Test(int v) {
    this.v = v;
  }

  public static void main(String[] args) {
    // Staff s1 = new Staff("John"); // private constructor = can't call

    // Static method, can not use this, no need object value
    Staff s2 = Staff.of("John");

    // instance method, can use this, need object value
    // instance, means object

    Test t = new Test(3);
    System.out.println(t.sum(1,100)); // 104
    System.out.println(Test.sum2(1,100)); //101



  }

/*
 * If a method can write in static method, write in static method,
 * because instance method use more memory, each object contain the method respectively
 */

  // Instance method can access parameters + instance variable
  public int sum(int x, int y) {
    return x + y + this.v;
  }

    // Static method can access parameters
    // but cannot access(read/write) parameters instance variable (cannot use this)
  public static int sum2(int x, int y) { // method sum2 belongs to Class
    return x + y;
  }
}


