package mehods;

public class Staff {
  
  private String name;

  private double salary;
    // Constructor
  private Staff(String name) {
    this.name = name;
  }
  private Staff(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
  // Static Method
  public static Staff of(String name) {
    return new Staff(name);
  }

  public static Staff peter() {
    return new Staff("Peter");
  }
  //instance method
  public double getSalary() {
    return this.salary;
  }
  public String toString() {
    return "Staff(" //
    + "name=" + this.name //
    + ", salary=" + this.salary //
    + ")";
  }

  public static void main(String[] args) {
    Staff s1 = new Staff("John");

    //Static method
    Staff s2 = Staff.of("John");
    Staff s3 = Staff.peter();
    System.out.println(s1.toString());
    System.out.println(s2);
  }
}
