package staticblock;

public class Student {

  public static final String collegeName;

  public static String abc = initialize();

  private String name;

  public static String initialize() {
    System.out.println("initialize");
    return"hello";
  }

  static { // static block
    System.out.println("static block");
    System.out.println("abc="+ abc);
    collegeName = "ABC";
    abc = "world";
  }

  // instance block
  {
    System.out.println("instance block");
    this.name = "John";
  }


  public Student(String name) {
    System.out.println("Constructor");
    if (name != null) {
      this.name = name;
    }
  }

  public String toString() {
    System.out.println("instane method");
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println("main start");

    System.out.println(Student.collegeName);
    Student s = new Student("jenny");
    System.out.println(s.toString());
    Student s2 = new Student("joe");
    System.out.println(s2.toString());
    System.out.println(s2.toString());
    Student s3 = new Student("joe");
    System.out.println("abc=" + abc);

    System.out.println("main end");
  }
}
