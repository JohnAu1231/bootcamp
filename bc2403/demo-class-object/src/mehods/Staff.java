package mehods;

public class Staff {

  //Static Final Variable (Class Constant, belongs to class)
  public static final double PI = 3.14159;

  //Final Variable (Object Constant, belongs to object)
  private final int HOURS_OF_DAY = 24;
  
  // Instance Variable
  private String name;

  // Static Variable 
  private static int ageLimit = 60; //0 

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

  public static int getAgeLimit() {
    return ageLimit;
  }
  //instance method
  public double getSalary() {
    return this.salary;
  }

  public int getHoursOfDay() {
    return this.HOURS_OF_DAY;
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

    System.out.println(Staff.ageLimit); //read
    Staff.ageLimit = 10; //write
    System.out.println(Staff.ageLimit); //read
    Staff.ageLimit = 12; //write
    System.out.println(s1.ageLimit); //12 with warning , not suppose to use

    // Object can access static variable (Dont't use!!!)
    // Static method cannpt access instance variable

    // Fianl instance Variable
    System.out.println(s1.getHoursOfDay());
    Staff s5 = Staff.of("Jenny);");

  }
}
